package com.example.maytinhbotui20072021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Khai báo biến
    EditText mEdtNumber1,mEdtNumber2;
    TextView mTvResult;
    Button mBtnPlus, mBtnMinus , mBtnDivide , mBtnMultiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        mEdtNumber1 = findViewById(R.id.editTextNumber1);
        mEdtNumber2 = findViewById(R.id.editTextNumber2);
        mTvResult = findViewById(R.id.textViewResult);
        mBtnMinus = findViewById(R.id.buttonMinus);
        mBtnPlus = findViewById(R.id.buttonPlus);
        mBtnDivide = findViewById(R.id.buttonDivide);
        mBtnMultiplication = findViewById(R.id.buttonMultiplication);


    }

}