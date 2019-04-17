package com.example.hw12hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText nameEdite;
    private EditText passwordEdite;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdite = findViewById(R.id.edit_name);
        passwordEdite = findViewById(R.id.edit_password);
        resultText = findViewById(R.id.text_result);

        findViewById(R.id.button_ok).setOnClickListener(okClickListener);
        findViewById(R.id.button_clear).setOnClickListener(clearClickListener);

    }

    private View.OnClickListener okClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name = String.valueOf(nameEdite.getText());
            String password = String.valueOf(passwordEdite.getText());

           String message = getString(R.string.message_confirmation, name, password);
           resultText.setText(message);

        }


    };
    private View.OnClickListener clearClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            nameEdite.setText(null);
            passwordEdite.setText(null);
            resultText.setText(null);

        }

        ;
    };
}
