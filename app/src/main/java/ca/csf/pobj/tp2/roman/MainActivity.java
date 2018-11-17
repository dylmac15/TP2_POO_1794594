package ca.csf.pobj.tp2.roman;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ca.csf.pobj.tp2.R;
import ca.csf.pobj.tp2.utils.StringUtils;

public class MainActivity extends AppCompatActivity {

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
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);


        
    }

    public void onConvertButtonClicked(View view) {
        if (isInputBlank()) {
            showEmptyInputMessage();
        } else {
            convertInputToOutputNumber();
        }
    }

    private void convertInputToOutputNumber() {

    }

    private boolean isInputBlank() {
        return StringUtils.isBlank(inputEditText.getText());
    }



    private void showEmptyInputMessage() {
        Snackbar.make(rootView, R.string.error_empty_input, Snackbar.LENGTH_SHORT).show();
    }
}
