package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vessel extends AppCompatActivity {
    Intent vessel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vessel);
    }
    public void actves (View view) {
        switch (view.getId()) {
            case R.id.bvesbw:
                vessel = new Intent(this, vesselbw.class);
                startActivity(vessel);
                break;
            case R.id.bvessc2:
                vessel = new Intent(this, vesselsc2.class);
                startActivity(vessel);
                break;
        }
    }
}