package com.example.recycleviewproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SignupActivity extends AppCompatActivity {
ImageButton signingoin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        signingoin=(ImageButton)findViewById(R.id.goSignin);
        signingoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignupActivity.this,HomeActivity.class);
                startActivity(intent);
            }
        });

    }
}