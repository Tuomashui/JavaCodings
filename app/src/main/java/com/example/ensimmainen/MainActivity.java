package com.example.ensimmainen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputNumber1;
    private EditText inputNumber2;
    private TextView outputNumber;
    private int result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputNumber1 = findViewById(R.id.add_number1);
        inputNumber2 = findViewById(R.id.add_number2);
        outputNumber = findViewById(R.id.result_number);

    }
        public void adding(View view){
            result = Integer.parseInt(inputNumber1.getText().toString()) + Integer.parseInt(inputNumber2.getText().toString());
            Toast.makeText(this, "Wuhuu! Sinä osaat!", Toast.LENGTH_SHORT).show();
            outputNumber.setText(Integer.toString(result));
        }
        public void minus(View view){
            result = Integer.parseInt(inputNumber1.getText().toString()) - Integer.parseInt(inputNumber2.getText().toString());
            Toast.makeText(this, "Hyvin menee!", Toast.LENGTH_SHORT).show();
            outputNumber.setText(Integer.toString(result));
        }
        public void divide(View view){
            result = Integer.parseInt(inputNumber1.getText().toString()) / Integer.parseInt(inputNumber2.getText().toString());
            Toast.makeText(this, "Helppoa ja kivaa!", Toast.LENGTH_SHORT).show();
            outputNumber.setText(Integer.toString(result));
        }
        public void multiply(View view){
            result = Integer.parseInt(inputNumber1.getText().toString()) * Integer.parseInt(inputNumber2.getText().toString());
            Toast.makeText(this, "Let's go!", Toast.LENGTH_SHORT).show();
            outputNumber.setText(Integer.toString(result));
        }

  }


