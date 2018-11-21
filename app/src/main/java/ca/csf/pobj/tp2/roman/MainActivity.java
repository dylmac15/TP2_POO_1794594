package ca.csf.pobj.tp2.roman;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ca.csf.pobj.tp2.R;
import ca.csf.pobj.tp2.utils.InputFilterMinMax;
import ca.csf.pobj.tp2.utils.NumberUtils;
import ca.csf.pobj.tp2.utils.StringUtils;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_INPUT_VALUE = "STATE_INPUT_VALUE";
    private static final String STATE_OUTPUT_VALUE = "STATE_OUTPUT_VALUE";

    private View rootView;
    private EditText inputEditText;
    private TextView outputTextView;

    private RomanNumeralConverter romanNumeralConverter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rootView = findViewById(R.id.rootView);
        inputEditText = findViewById(R.id.inputEditText);
        outputTextView = findViewById(R.id.outputTextView);

        romanNumeralConverter = new RomanNumeralConverter();

        inputEditText.setFilters(new InputFilter[]{ new InputFilterMinMax("1", "4999")});
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        inputEditText.setText(savedInstanceState.getCharSequence(STATE_INPUT_VALUE));
        outputTextView.setText(savedInstanceState.getCharSequence(STATE_OUTPUT_VALUE));

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putCharSequence(STATE_INPUT_VALUE, inputEditText.getText());
        outState.putCharSequence(STATE_OUTPUT_VALUE, outputTextView.getText());

    }

    public void onConvertButtonClicked(View view) {
        if (isInputBlank() ) {
            showEmptyInputMessage();
        } else if(isInvalid()) {
            showInvalidInputMessage();
        } else {
            convertInputToOutputNumber();
        }
    }

    private boolean isInvalid() {
        int inputValue = Integer.parseInt(inputEditText.getText().toString());

        if(inputValue < RomanNumeralConverter.MIN_VALUE || inputValue > RomanNumeralConverter.MAX_VALUE) {
            return true;
        }
        else {
            return false;
        }
    }

    private void convertInputToOutputNumber() {
        String outputValue;
        int inputValue = NumberUtils.toInt(inputEditText.getText());

        outputValue = romanNumeralConverter.toRoman(inputValue);

        outputTextView.setText(outputValue);
    }

    private boolean isInputBlank() {
        return StringUtils.isBlank(inputEditText.getText());
    }


    private void showEmptyInputMessage() {
        Snackbar.make(rootView, R.string.error_empty_input, Snackbar.LENGTH_SHORT).show();
    }

    private void showInvalidInputMessage() {
        Snackbar.make(rootView, R.string.invalid_empty_input, Snackbar.LENGTH_SHORT).show();
    }
}
