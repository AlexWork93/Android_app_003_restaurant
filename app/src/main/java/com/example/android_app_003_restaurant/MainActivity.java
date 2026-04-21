package com.example.android_app_003_restaurant;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    CardView starters;
    CardView main_course;
    CardView deserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        starters = findViewById(R.id.card_view_starters);
        main_course = findViewById(R.id.card_view_main_course);
        deserts = findViewById(R.id.card_view_deserts);

        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent starterIntent = new Intent(MainActivity.this, StartersActivity.class);

                startActivity(starterIntent);
            }
        });

        main_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainCourseIntent = new Intent(MainActivity.this, MainCourseActivity.class);
                startActivity(mainCourseIntent);
            }
        });

        deserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desertsIntent = new Intent(MainActivity.this, Deserts_activity.class);
                startActivity(desertsIntent);
            }
        });
    }
}