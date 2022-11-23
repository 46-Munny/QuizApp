package com.example.myquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private TextView question,score;
    private Button btnSubmit;
    private RadioButton answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.optionId);
        score=findViewById(R.id.score);
        question=findViewById(R.id.question1);
        btnSubmit=findViewById(R.id.submitButton);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int scr=0;
                String s;
                int selectId = radioGroup.getCheckedRadioButtonId();
                answer=findViewById(selectId);
                String value=answer.getText().toString();
                if (value.equals("C")){
                    scr++;
                }
                s=scr+"";
                score.setText(s);
            }
        });
    }
}
