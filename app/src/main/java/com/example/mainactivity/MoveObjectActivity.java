package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveObjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_object);
        TextView tvExname = findViewById(R.id.tv_name);
        TextView tvEmail = findViewById(R.id.tv_email);
        TextView tvStatus = findViewById(R.id.tv_status);

        UserData userData = getIntent().getParcelableExtra("userdata");

        String name = userData.getName();
        String email = userData.getEmail();
        String status = userData.getStatus();

        tvExname.setText(name);
        tvEmail.setText(email);
        tvStatus.setText(status);
    }
}
