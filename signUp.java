package com.example.beta20;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class signUp extends AppCompatActivity {

    ImageView image;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Spinner red = (Spinner)findViewById(R.id.spinny);
        ArrayAdapter <String> myAdapter = new ArrayAdapter<String>(signUp.this, android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.red1));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        red.setAdapter(myAdapter);


       Button btnCamera = (Button) findViewById(R.id.btnCam);
        ImageView iv = (ImageView) findViewById(R.id.caamera);
        
        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i,0);
            }
        });
            }
        @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bitmap bm = (Bitmap) data.getExtras().get("data");
        image.setImageBitmap(bm);
    }
        

    }
