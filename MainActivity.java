package com.example.beta20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnSi;
    private Button btnSu;
   
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSi =  (Button)findViewById(R.id.buttonSignIn);
        btnSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSI();
            }
        });

        btnSu =  (Button)findViewById(R.id.buttonSignUp);
        btnSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSU();
            }
        });
    }

    public void openSI(){
        Intent sI = new Intent(this, signIn.class);
        startActivity(sI);
    }

    public void openSU(){
        Intent sU = new Intent(this, signUp.class);
        startActivity(sU);
    }
}
