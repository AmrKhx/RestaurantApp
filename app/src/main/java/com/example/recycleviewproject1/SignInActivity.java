package com.example.recycleviewproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
ImageButton signinbtn;
TextView signupage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
        signinbtn=(ImageButton) findViewById(R.id.signbtn);
        signupage=(TextView)findViewById(R.id.signup);
        signupage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signupactivity();
            }
        });
        signinbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                homeactivity();
            }
        });

    }

    private void signupactivity() {
        Intent intent=new Intent(this,SignupActivity.class);
        startActivity(intent);

    }

    private void homeactivity() {
        Intent intent=new Intent(this,HomeActivity.class);
        startActivity(intent);

    }
}