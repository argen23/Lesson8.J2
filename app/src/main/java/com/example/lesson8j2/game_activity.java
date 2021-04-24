package com.example.lesson8j2;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class game_activity extends AppCompatActivity {

    EditText editText;
    String userAnswer;
    String adminAnswer;
    Button check_button;
    boolean isCheck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_activity);
        editText = findViewById(R.id.edTXT);
        check_button = findViewById(R.id.check_button);
        userAnswer = editText.getText().toString();

        check_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().equals("19")) {
                    Toast.makeText(game_activity.this, "угадали!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(game_activity.this, "не угадали", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
//        initViews();
      // initClickers();
//        initAction();
//        answer();
    }
//public void initClickers(){
//        check_button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(userAnswer.equals("19")) {
//                    Toast.makeText(game_activity.this, "угадали!", Toast.LENGTH_SHORT).show();
//                }else{
//                    Toast.makeText(game_activity.this,"не угадали",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//}
//    public void onClick(View view){
//        if(isCheck) {
//            Toast.makeText(this, " угадали!", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this,"не угадали", Toast.LENGTH_SHORT).show();
//        }
  //  }

//    private void initAction(){
//        userAnswer = editText.getText().toString();
//
//    }
//
//    private void initViews(){
//        editText  =  findViewById(R.id.edTXT);
//        check_button = findViewById(R.id.check_button);
//    }
//    private void answer (){
//        adminAnswer = "19";
//        if(userAnswer == adminAnswer) {
//            Toast.makeText(this, "right", Toast.LENGTH_SHORT).show();
//        }else{
//            Toast.makeText(this,"left",Toast.LENGTH_SHORT).show();
//        }
//    }
