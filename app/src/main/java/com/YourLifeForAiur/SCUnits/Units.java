package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class Units extends AppCompatActivity {
    Intent units;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_units);
    }
    public void actr(View view) {

        switch (view.getId()) {

            case R.id.bzerg:
                units = new Intent(this, zerg.class);
                startActivity(units);
                break;
            case R.id.bterran:
                units = new Intent(this, terran.class);
                startActivity(units);
                break;
            case R.id.bprotoss:
                units = new Intent(this, protoss.class);
                startActivity(units);
                break;


        }
    }
}