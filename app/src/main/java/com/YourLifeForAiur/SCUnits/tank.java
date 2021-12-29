package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tank extends AppCompatActivity {
    Intent tank;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tank);
    }
    public void acttank (View view) {
        switch (view.getId()) {
            case R.id.btankbw:
                tank = new Intent(this, tankbw.class);
                startActivity(tank);
                break;
            case R.id.btanksc2:
                tank = new Intent(this, tanksc2.class);
                startActivity(tank);
                break;
        }
    }
}