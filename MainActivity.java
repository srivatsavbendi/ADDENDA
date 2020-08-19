package com.example.whatshouldido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button artsView;
    Button outsideView;
    Button cookingView;
    Button onlineView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // gets ride of top bar with application name
        getSupportActionBar().hide();
        // gets ride of top bar with time, date, charge, etc.
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Button randomView = (Button) findViewById(R.id.randomButton);
        artsView = (Button) findViewById(R.id.artsButton);
        outsideView = (Button) findViewById(R.id.againButton);
        cookingView = (Button) findViewById(R.id.homeButton);
        onlineView = (Button) findViewById(R.id.onlineButton);

        randomView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGenerateActivity();
            }
        });

        artsView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArtsActivity();
            }
        });

        outsideView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOutdoorActivity();
            }
        });

        cookingView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCookingActivity();
            }
        });

        onlineView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsiteActivity();
            }
        });

    }
    public void openGenerateActivity() {
        Intent intent = new Intent(this, GenerateActivity.class);
        startActivity(intent);
    }
    public void openArtsActivity() {
        Intent intent = new Intent(this, ArtsActivity.class);
        startActivity(intent);
    }
    public void openOutdoorActivity() {
        Intent intent = new Intent(this, outdoorActivity.class);
        startActivity(intent);
    }
    public void openCookingActivity() {
        Intent intent = new Intent(this, cookingActivity.class);
        startActivity(intent);
    }public void openWebsiteActivity() {
        Intent intent = new Intent(this, websiteActivity.class);
        startActivity(intent);
    }
}
