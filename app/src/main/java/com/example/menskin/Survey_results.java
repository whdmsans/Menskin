package com.example.menskin;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class Survey_results extends AppCompatActivity {
    int[] data = getIntent().getIntArrayExtra("surveyResult");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_survey_results);


    }
}