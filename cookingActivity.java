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

public class cookingActivity extends AppCompatActivity {
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
        randomMap.put("Pizza", "link");
        randomMap.put("Lasagna", "link");
        randomMap.put("Chilli Chicken", "link");
        randomMap.put("Chicken Biriyani", "link");
        randomMap.put("Chicken 65", "link");
        randomMap.put("Butter Chicken", "link");
        randomMap.put("Parfait", "link");
        randomMap.put("Nachos and Cheese", "link");
        randomMap.put("Italian Breadsticks", "link");
        randomMap.put("Fried Chicken", "link");
        randomMap.put("Chicken Burger", "link");
        randomMap.put("Poutine", "link");
        randomMap.put("Grilled Cheese", "link");
        randomMap.put("Dumplings", "link");
        randomMap.put("Apple Pie", "link");
        randomMap.put("Sushi", "link");
        randomMap.put("Chocolate Cake", "link");
        randomMap.put("Chocolate Muffins", "link");
        randomMap.put("Chocolate Brownies", "link");
        randomMap.put("Strawberry Milkshake", "link");



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
        randomMap.put("Pizza", "link");
        randomMap.put("Lasagna", "link");
        randomMap.put("Chilli Chicken", "link");
        randomMap.put("Chicken Biriyani", "link");
        randomMap.put("Chicken 65", "link");
        randomMap.put("Butter Chicken", "link");
        randomMap.put("Parfait", "link");
        randomMap.put("Nachos and Cheese", "link");
        randomMap.put("Italian Breadsticks", "link");
        randomMap.put("Fried Chicken", "link");
        randomMap.put("Chicken Burger", "link");
        randomMap.put("Poutine", "link");
        randomMap.put("Grilled Cheese", "link");
        randomMap.put("Dumplings", "link");
        randomMap.put("Apple Pie", "link");
        randomMap.put("Sushi", "link");
        randomMap.put("Chocolate Cake", "link");
        randomMap.put("Chocolate Muffins", "link");
        randomMap.put("Chocolate Brownies", "link");
        randomMap.put("Strawberry Milkshake", "link");



        Object[] randomKeys = randomMap.keySet().toArray();
        Object randomkey = randomKeys[new Random().nextInt(randomKeys.length)];
        nameView.setText((String) randomkey);
        nameView.setTextSize(TypedValue.COMPLEX_UNIT_SP,20);



    }
}
