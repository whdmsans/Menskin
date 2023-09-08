package com.example.menskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 1로 이동하는 코드를 작성
                Intent intent = new Intent(MainActivity.this, Screen1Activity.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 2로 이동하는 코드를 작성
                Intent intent = new Intent(MainActivity.this, Screen2Activity.class);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 3로 이동하는 코드를 작성
                Intent intent = new Intent(MainActivity.this, Screen3Activity.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 화면 4로 이동하는 코드를 작성
                Intent intent = new Intent(MainActivity.this, Screen4Activity.class);
                startActivity(intent);
            }
        });
    }
}