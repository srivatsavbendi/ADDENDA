package com.example.whatshouldido;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;

public class ArtsActivity extends AppCompatActivity {
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
        randomMap.put("Draw a Globe with 3D natural features", "link");
        randomMap.put("Draw a World Map with Famous Places", "link");
        randomMap.put("Paint a Character from your favorite book", "link");
        randomMap.put("Paint a Character from your favorite movie", "link");
        randomMap.put("Draw a scene from your favorite movie", "link");
        randomMap.put("Draw a scene from your favorite Tv Show", "link");
        randomMap.put("Paint a new cover page for a  book", "link");
        randomMap.put("Paint a campfire setting in the woods", "link");
        randomMap.put("Learn and create origami", "link");
        randomMap.put("Draw a picture of your ideal romantic date", "link");
        randomMap.put("Draw a new person based on yourself", "link");
        randomMap.put("Invent a new person", "link");
        randomMap.put("Paint a Sunset/Sunrise", "link");

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
        randomMap.put("Draw a Globe with 3D natural features", "link");
        randomMap.put("Draw a World Map with Famous Places", "link");
        randomMap.put("Paint a Character from your favorite book", "link");
        randomMap.put("Paint a Character from your favorite movie", "link");
        randomMap.put("Draw a scene from your favorite movie", "link");
        randomMap.put("Draw a scene from your favorite Tv Show", "link");
        randomMap.put("Paint a new cover page for a  book", "link");
        randomMap.put("Paint a campfire setting in the woods", "link");
        randomMap.put("Learn and create origami", "link");
        randomMap.put("Draw a picture of your ideal romantic date", "link");
        randomMap.put("Draw a new person based on yourself", "link");
        randomMap.put("Invent a new person", "link");
        randomMap.put("Paint a Sunset/Sunrise", "link");



        Object[] randomKeys = randomMap.keySet().toArray();
        Object randomkey = randomKeys[new Random().nextInt(randomKeys.length)];
        nameView.setText((String) randomkey);
        nameView.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);



    }
}
