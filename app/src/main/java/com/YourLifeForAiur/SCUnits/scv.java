package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class scv extends AppCompatActivity {
    Intent scv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scv);
    }
    public void actscv (View view) {
        switch (view.getId()) {
            case R.id.bscvbw:
                scv = new Intent(this, scvbw.class);
                startActivity(scv);
                break;
            case R.id.bscvsc2:
                scv = new Intent(this, scvsc2.class);
                startActivity(scv);
                break;
        }
    }
}