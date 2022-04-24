package com.example.doit8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class menu3 extends AppCompatActivity {
    public static final int RESPONSE_CODE_OK = 200;
    public static final int REQUEST_CODE_MAIN = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3);

        // process received intent
        Intent receivedIntent = getIntent();

        Button menu01Button = findViewById(R.id.button1);
        menu01Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "고객관리 메뉴");

                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

        Button menu02Button = findViewById(R.id.button2);
        menu02Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "로그인으로");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);

                startActivityForResult(intent,REQUEST_CODE_MAIN);
                finish();
            }
        });

    }
}