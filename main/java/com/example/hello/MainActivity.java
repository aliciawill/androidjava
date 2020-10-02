package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText t1;
        Button b1, b3, b4, b5, b6, b7, go1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.drawable.pie);
        b1 = findViewById(R.id.button);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        go1 = findViewById(R.id.go1);
        t1 = findViewById(R.id.editTextTextPersonName);

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);


        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.radioButton) {
                    t1.setText("오레오야!!");
                } else {
                    t1.setText("파이야!");
                }

                RadioButton rd = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
                String radio_value = rd.getText().toString();

                Toast.makeText(getApplicationContext(), radio_value + " 선택됨", Toast.LENGTH_SHORT).show();
            }

        });


        b1.setOnClickListener(new View.OnClickListener() { //option+enter(unimplement)
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요!!!", Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-4914-2996"));
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = t1.getText().toString();
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }
        });
        go1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                int extra_int =5;
                float extra_float = 10;
                String extra_str = "str_ex";
                int[] myarr = new int[]{1,2,3,4,5};

                intent.putExtra("exi", extra_int);
                intent.putExtra("exf", extra_float);
                intent.putExtra("exs", extra_str);
                intent.putExtra("exma", myarr);

                startActivity(intent);
                Toast.makeText(getApplicationContext(), extra_int + "," + extra_float + "," + extra_str+ "," + myarr[3] + "=> 다음 액티비티로 go1!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}