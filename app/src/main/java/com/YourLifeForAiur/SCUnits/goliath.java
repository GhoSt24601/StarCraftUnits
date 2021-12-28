package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class goliath extends AppCompatActivity {
    Intent goliath;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goliath);
    }
    public void actgol (View view) {
        switch (view.getId()) {
            case R.id.bgolbw:
                goliath = new Intent(this, goliathbw.class);
                startActivity(goliath);
                break;
            case R.id.bgolsc2:
                goliath = new Intent(this, goliathsc2.class);
                startActivity(goliath);
                break;
        }
    }
}