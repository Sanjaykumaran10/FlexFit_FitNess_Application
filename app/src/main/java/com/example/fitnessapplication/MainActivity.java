package com.example.fitnessapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toobar);
        setSupportActionBar(toolbar);


        Animation animation = AnimationUtils.loadAnimation(this, R.anim.bounce);


        button1=findViewById(R.id.startex);
        button2=findViewById(R.id.startex2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button1.startAnimation(animation);
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });








        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button2.startAnimation(animation);
                Intent intent=new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);
            }
        });


    }

    public void greaterthan18(View view) {

        Intent intent =new Intent(MainActivity.this,SecondActivity.class );
        startActivity(intent);
    }

    public void lessthan18(View view) {
        Intent intent =new Intent(MainActivity.this,SecondActivity2.class );
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent =new Intent(MainActivity.this,FoodActivity.class );
        startActivity(intent);
    }
}