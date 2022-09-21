package com.example.chapter1practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    TextView textView;
    Button button;
    String result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.editTextNumber1);
        textView = findViewById(R.id.editTextNumber2);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(num1==null){
                    textView.setText(0);
                }
                else
                {
                    int mul = Integer.parseInt(num1.getText().toString());
                    result = "";
                    for (int i = 1; i <= 10; i++) {
                        result += mul + " x " + i + " = " + mul * i + "\n";
                        textView.setText(result);
                    }
                }


            }
        });

    }

}