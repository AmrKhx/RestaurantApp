package com.example.recycleviewproject1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView mRecylcerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mlayoutManager;
    ImageButton reportpg;
    ImageButton profilepg;
    Button invtbtn;
    TextView textpref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textpref=(TextView)findViewById(R.id.preftext) ;

        reportpg=(ImageButton) findViewById(R.id.reportbtn);
        profilepg=(ImageButton) findViewById(R.id.profilebtn);
        invtbtn=(Button) findViewById(R.id.btniv);
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("my prefs", Context.MODE_PRIVATE);
        String usrname = sharedPreferences.getString("username","   ");
        textpref.setText("Welcome"+" " +usrname);
        invtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(HomeActivity.this,InvitePageActivity.class);
               startActivity(intent);
            }
        });
        profilepg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userpage();
            }
        });
        reportpg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reportpage();
            }
        });


        ArrayList<RecyclerItem> recyclerItems = new ArrayList<>();
        recyclerItems.add(new RecyclerItem(R.drawable.kabajee,"Kabajee",R.drawable.reaval));
        recyclerItems.add(new RecyclerItem(R.drawable.img,"Buffalo",R.drawable.reaval));
        recyclerItems.add(new RecyclerItem(R.drawable.bogie,"Cafe Bogie",R.drawable.reunaval));
        recyclerItems.add(new RecyclerItem(R.drawable.kabajee,"Kabajee",R.drawable.reaval));
        recyclerItems.add(new RecyclerItem(R.drawable.tandoor,"Tandoor",R.drawable.reunaval));
        recyclerItems.add(new RecyclerItem(R.drawable.img,"Buffalo",R.drawable.reunaval));
        recyclerItems.add(new RecyclerItem(R.drawable.kabajee,"Kabajee",R.drawable.reaval));


        mRecylcerView = findViewById(R.id.recyclerview);
        mRecylcerView.setHasFixedSize(true);
        mlayoutManager = new LinearLayoutManager(this);
        mAdapter= new RecyclerAdaper(recyclerItems);
        mRecylcerView.setLayoutManager(mlayoutManager);
        mRecylcerView.setAdapter(mAdapter);

    }

    private void userpage() {
        Intent intent=new Intent(this,UserProfileActivity.class);
        startActivity(intent);
    }

    private void reportpage() {
        Intent intent=new Intent(this,ReportActivity.class);
        startActivity(intent);
    }
}

