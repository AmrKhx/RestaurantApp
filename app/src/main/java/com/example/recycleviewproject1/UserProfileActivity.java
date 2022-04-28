package com.example.recycleviewproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UserProfileActivity extends AppCompatActivity {
ImageButton contbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        contbtn=findViewById(R.id.contbtn);
        
        contbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(UserProfileActivity.this,HomeActivity.class);
               Toast.makeText(this, "profile saved", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                
            }
        });

    }
}
