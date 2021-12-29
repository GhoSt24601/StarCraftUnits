package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wraith extends AppCompatActivity {
    Intent wraith;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wraith);
    }
    public void actmir (View view) {
        switch (view.getId()) {
            case R.id.bmirbw:
                wraith = new Intent(this, wraithbw.class);
                startActivity(wraith);
                break;
            case R.id.bmirsc2:
                wraith = new Intent(this, wraithsc2.class);
                startActivity(wraith);
                break;
        }
    }
}