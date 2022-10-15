package com.example.firstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityWithInput extends AppCompatActivity {

    private EditText inputMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_input);

        Button saveMessage = findViewById(R.id.saveMessage);
        saveMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputMessage = findViewById(R.id.inputMessage);

                String message = inputMessage.getText().toString();
                Intent intent = new Intent(ActivityWithInput.this, MainActivity.class);
                intent.putExtra("message", message);
                startActivity(intent);
            }
        });
    }

}