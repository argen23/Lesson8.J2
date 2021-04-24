package com.example.lesson8j2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class game_activity_2level extends AppCompatActivity {

    EditText edTXT2;
    String userAnswer;
    Button check_button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_2level);
        edTXT2 = findViewById(R.id.edTXT2);
        userAnswer = edTXT2.getText().toString();
        check_button2 = findViewById(R.id.check_button2);

        check_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edTXT2.getText().toString().equals("железный человек")) {
                    Toast.makeText(game_activity_2level.this, "угадали!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(game_activity_2level.this, "не угадали", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}