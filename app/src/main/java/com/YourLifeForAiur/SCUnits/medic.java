package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class medic extends AppCompatActivity {
    Intent medic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medic);
    }
    public void actmed (View view) {
        switch (view.getId()) {
            case R.id.bmedbw:
                medic = new Intent(this, medicbw.class);
                startActivity(medic);
                break;
            case R.id.bmedsc2:
                medic = new Intent(this, medicsc2.class);
                startActivity(medic);
                break;
        }
    }
}