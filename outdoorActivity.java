package com.example.whatshouldido;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Random;

public class outdoorActivity extends AppCompatActivity {
    Button moreView;
    Button againView;
    Button homeView;
    TextView nameView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // gets ride of top bar with application name
        getSupportActionBar().hide();
        // gets ride of top bar with time, date, charge, etc.
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        HashMap<String, String> randomMap = new HashMap<>();
        randomMap.put("Make a hammock in your backyard", "link");
        randomMap.put("Go geochaching", "link");
        randomMap.put("Learn how to bike", "link");
        randomMap.put("Learn how to skateboard", "link");
        randomMap.put("Go swim in the community pool", "link");
        randomMap.put("Play Basketball with your friends/siblings", "link");
        randomMap.put("Play Soccer with your friends/siblings", "link");
        randomMap.put("Go Swim with your friends/siblings", "link");
        randomMap.put("Jump in the hottub", "link");
        randomMap.put("Make a lemonade stand", "link");
        randomMap.put("Make water ballons and throw them at your family", "link");

        Object[] randomKeys = randomMap.keySet().toArray();
        Object randomkey = randomKeys[new Random().nextInt(randomKeys.length)];

        moreView = (Button) findViewById(R.id.moreButton);
        againView = (Button) findViewById(R.id.againButton);
        homeView = (Button) findViewById(R.id.homeButton);
        nameView = (TextView) findViewById(R.id.name);
        againView = (Button) findViewById(R.id.againButton);



        nameView.setText((String) randomkey);
        nameView.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);

        againView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgainActivity();
            }
        });
        homeView.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();

            }
        });
    }
    public void openHomeActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openAgainActivity() {
        HashMap<String, String> randomMap = new HashMap<>();
        randomMap.put("Make a hammock in your backyard", "link");
        randomMap.put("Go geochaching", "link");
        randomMap.put("Learn how to bike", "link");
        randomMap.put("Learn how to skateboard", "link");
        randomMap.put("Go swim in the community pool", "link");
        randomMap.put("Play Basketball with your friends/siblings", "link");
        randomMap.put("Play Soccer with your friends/siblings", "link");
        randomMap.put("Go Swim with your friends/siblings", "link");
        randomMap.put("Jump in the hottub", "link");
        randomMap.put("Make a lemonade stand", "link");
        randomMap.put("Make water ballons and throw them at your family", "link");



        Object[] randomKeys = randomMap.keySet().toArray();
        Object randomkey = randomKeys[new Random().nextInt(randomKeys.length)];
        nameView.setText((String) randomkey);
        nameView.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);



    }
}
