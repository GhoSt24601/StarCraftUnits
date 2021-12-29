package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ghost extends AppCompatActivity {
    Intent ghost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghost);
    }
    public void actgh (View view) {
        switch (view.getId()) {
            case R.id.bghbw:
                ghost = new Intent(this, ghostbw.class);
                startActivity(ghost);
                break;
            case R.id.bghsc2:
                ghost = new Intent(this, ghostsc2.class);
                startActivity(ghost);
                break;
        }
    }
}