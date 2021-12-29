package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class marine extends AppCompatActivity {
    Intent marine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marine);
    }
    public void actmar (View view) {
        switch (view.getId()) {
            case R.id.bmarbw:
                marine = new Intent(this, marinebw.class);
                startActivity(marine);
                break;
            case R.id.bmarsc2:
                marine = new Intent(this, marinesc2.class);
                startActivity(marine);
                break;
        }
    }
}