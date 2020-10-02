package com.example.hello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup rg;
    RadioButton dog, cat, rabbit;
    TextView tv;
    Button button, button2;
    ImageView img;
    CheckBox check;
    Switch switch1;

    // 변수명을 너무 간단하게 설정하면 안됨, 예)b, p, c(x)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String exs = intent.getStringExtra("exs");
        int exi = intent.getIntExtra("exi", 0);
        float exf = intent.getFloatExtra("exf", 0);
        int[] exma = intent.getIntArrayExtra("exma");
        Toast.makeText(getApplicationContext(), exs + "\n" + exi + "\n" + exf + "\n" + exma[3]+ "=> 받음!!!", Toast.LENGTH_SHORT).show();

        rg = findViewById(R.id.rg);
        dog = findViewById(R.id.dog);
        cat = findViewById(R.id.cat);
        rabbit = findViewById(R.id.rabbit);
        tv = findViewById(R.id.tv);
        button = (Button) findViewById(R.id.b);
        button2 = (Button) findViewById(R.id.button2);
        img = findViewById(R.id.imageView);
        check = findViewById(R.id.check);
        switch1 = findViewById(R.id.switch1);


        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (check.isChecked() == true) {
                    tv.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                } else {
                    tv.setVisibility(View.INVISIBLE);
                    rg.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() { //자동완성 중 alt+enter하면 unimplemented method  자동완성 됨.

            @Override
            public void onClick(View view) {
                switch (rg.getCheckedRadioButtonId()) {
                    case R.id.dog:
                        img.setImageResource(R.drawable.dog);
                        break;
                    case R.id.cat:
                        img.setImageResource(R.drawable.cat);
                        break;
                    case R.id.rabbit:
                        img.setImageResource(R.drawable.rabbit);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요.!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity2.this, "체크상태 = " + isChecked, Toast.LENGTH_SHORT).show();
                if (switch1.isChecked() == true) {
                    tv.setVisibility(View.VISIBLE);
                    rg.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                } else {
                    tv.setVisibility(View.INVISIBLE);
                    rg.setVisibility(View.INVISIBLE);
                    button.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//            MainActivity2.super.onBackPressed();
                finish();  //activity간 live하면서 data transfer하는 경우는 사용하면 안됨. process terminated해버리기 때문!
            }
        });

    }
}