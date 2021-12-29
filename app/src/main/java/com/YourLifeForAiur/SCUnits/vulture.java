package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vulture extends AppCompatActivity {
    Intent vulture;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vulture);
    }
    public void actvul (View view) {
        switch (view.getId()) {
            case R.id.bvulbw:
                vulture = new Intent(this, vulturebw.class);
                startActivity(vulture);
                break;
            case R.id.bvulsc2:
                vulture = new Intent(this, vulturesc2.class);
                startActivity(vulture);
                break;
        }
    }
}