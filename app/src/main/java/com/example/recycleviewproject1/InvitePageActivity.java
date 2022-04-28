package com.example.recycleviewproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class InvitePageActivity extends AppCompatActivity {
ImageButton ivbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invite_page);
        ivbtn=(ImageButton)findViewById(R.id.emailbtn);
        ivbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://mail.google.com"));
                startActivity(intent);
            }
        });
    }
}