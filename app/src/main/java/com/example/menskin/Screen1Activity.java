package com.example.menskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Screen1Activity extends AppCompatActivity {
    int i;
    int[] data = new int[3];

    boolean isButtonClicked1 = false;
    boolean isButtonClicked2 = false;
    boolean isButtonClicked3 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        for(i = 0; i < 3; i++) {
            data[i] = 50;
        }

        Button button1 = findViewById(R.id.button1_5);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isButtonClicked1) {
                    // 버튼이 클릭된 상태이면 다시 원래 색상으로 변경
                    button1.setBackgroundColor(Color.parseColor("#00FE04"));
                    data[1] -= 20;
                    data[0] += 10;
                } else {
                    // 버튼이 클릭되지 않은 상태이면 클릭된 상태의 색상으로 변경
                    button1.setBackgroundColor(Color.BLACK);
                    data[1] += 20;
                    data[0] -= 10;
                }

                // 버튼 상태 토글
                isButtonClicked1 = !isButtonClicked1;
            }
        });

        Button button2 = findViewById(R.id.button2_1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isButtonClicked2) {
                    // 버튼이 클릭된 상태이면 다시 원래 색상으로 변경
                    button2.setBackgroundColor(Color.parseColor("#FF0000"));
                    data[2] -= 40;
                    data[0] += 10;
                } else {
                    // 버튼이 클릭되지 않은 상태이면 클릭된 상태의 색상으로 변경
                    button2.setBackgroundColor(Color.BLACK);
                    data[2] += 40;
                    data[0] -= 10;
                }

                // 버튼 상태 토글
                isButtonClicked2 = !isButtonClicked2;
            }
        });

        Button button3 = findViewById(R.id.button3_2);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isButtonClicked3) {
                    // 버튼이 클릭된 상태이면 다시 원래 색상으로 변경
                    button3.setBackgroundColor(Color.parseColor("#00FE04"));
                    data[0] += 5;
                } else {
                    // 버튼이 클릭되지 않은 상태이면 클릭된 상태의 색상으로 변경
                    button3.setBackgroundColor(Color.BLACK);
                    data[0] -= 5;
                }

                // 버튼 상태 토글
                isButtonClicked3 = !isButtonClicked3;
            }
        });

        Button btn = findViewById(R.id.btn_next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Screen1Activity.this, Survey_results.class);
                intent.putExtra("surveyResult", data);
                startActivity(intent);
                finish();
            }
        });
    }
}