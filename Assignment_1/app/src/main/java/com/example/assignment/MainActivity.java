package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
    }

    public void wakeUp(View view) {
        Intent intent = new Intent(this,WakeUp.class);
        startActivity(intent);
    }

    public void toilet(View view) {
        Intent intent = new Intent(this,Toilet.class);
        startActivity(intent);
    }

    public void eatingB(View view) {
        Intent intent = new Intent(this,EatingB.class);
        startActivity(intent);
    }

    public void eatingA(View view) {
        Intent intent = new Intent(this,EatingA.class);
        startActivity(intent);
    }

    public void travel(View view) {
        Intent intent = new Intent(this,Travel.class);
        startActivity(intent);
    }

    public void protection(View view) {
        Intent intent = new Intent(this,Protection.class);
        startActivity(intent);
    }

    public void sleep(View view) {
        Intent intent = new Intent(this,Sleep.class);
        startActivity(intent);
    }

    public void exit(View view) {
        finish();
        System.exit(0);
    }
}