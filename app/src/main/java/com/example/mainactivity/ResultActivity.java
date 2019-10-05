package com.example.mainactivity;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        String result = "Succes";

        Intent returnIntent = getIntent();
        returnIntent.putExtra("result",result);
        setResult(RESULT_OK,returnIntent);
        finish();
    }
}
