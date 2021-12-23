package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class raynor extends AppCompatActivity {
Intent raynor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raynor);
    }
    public void actray (View view) {
        switch (view.getId()) {
            case R.id.braybw:
                raynor = new Intent(this, raynorbw.class);
                startActivity(raynor);
                break;
            case R.id.braywol:
                raynor = new Intent(this, raynorwol.class);
                startActivity(raynor);
                break;
        }
    }
}