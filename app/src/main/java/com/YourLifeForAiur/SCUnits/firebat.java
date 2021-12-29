package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class firebat extends AppCompatActivity {
    Intent firebat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebat);
    }
    public void actfir (View view) {
        switch (view.getId()) {
            case R.id.bfirbw:
                firebat = new Intent(this, firebatbw.class);
                startActivity(firebat);
                break;
            case R.id.bfirsc2:
                firebat = new Intent(this, firebatsc2.class);
                startActivity(firebat);
                break;
        }
    }
}