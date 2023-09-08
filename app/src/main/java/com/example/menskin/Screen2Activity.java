package com.example.menskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Button btn_camera = findViewById(R.id.btn_camera);

        btn_camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 1로 이동하는 코드를 작성
                Intent intent = new Intent(Screen2Activity.this, Camera.class);
                startActivity(intent);
            }
        });
    }
}