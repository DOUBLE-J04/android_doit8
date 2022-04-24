package com.example.doit8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_CUSTOMER = 201;
    public static final int REQUEST_CODE_REVENUE = 202;
    public static final int REQUEST_CODE_PRODUCT = 203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // process received intent
        Intent receivedIntent = getIntent();

        Button menu01Button = findViewById(R.id.button1);
        menu01Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), menu2.class);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "고객관리 메뉴");

                startActivityForResult(intent, REQUEST_CODE_CUSTOMER);
                finish();
            }
        });

        Button menu02Button = findViewById(R.id.button2);
        menu02Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), menu3.class);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "매출관리 메뉴");

                startActivityForResult(intent, REQUEST_CODE_REVENUE);
                finish();
            }
        });

        Button menu03Button = findViewById(R.id.button3);
        menu03Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), menu4.class);
                Intent resultIntent = new Intent();
                resultIntent.putExtra("menu", "상품관리 메뉴");

                startActivityForResult(intent, REQUEST_CODE_PRODUCT);
                finish();
            }
        });

    }
}