package com.example.recycleviewproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity  {
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
                String notify="Welcome to our Home";
                Notification.Builder builder = new Notification.Builder(SignInActivity.this);
                builder.setSmallIcon(R.drawable.ic_notif);
                builder.setContentTitle("Welcome");
                builder.setContentText(notify);
                builder.setAutoCancel(true);
                Intent intent=new Intent(SignInActivity.this,HomeActivity.class);
                startActivity(intent);
                intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TOP);
                PendingIntent pendingIntent = PendingIntent.getActivity(SignInActivity.this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT);
                builder.setContentIntent(pendingIntent);
                NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
                notificationManager.notify(0,builder.build());

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
amr
    }
}