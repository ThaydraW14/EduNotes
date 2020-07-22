package com.example.beta20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signIn extends AppCompatActivity {
    private Button btnLi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        btnLi =  (Button)findViewById(R.id.buttonLI);
        btnLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLI();
            }
        });
    }

    public void openLI(){
        Intent lI = new Intent(this, accntHome.class);
        startActivity(lI);
    }

}
