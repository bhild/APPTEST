package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toMap();
    }
    public void toMap(){
        Button b0 = findViewById(R.id.toMap);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                setContentView(R.layout.activity_map_maker);
            }
        });
    }
}