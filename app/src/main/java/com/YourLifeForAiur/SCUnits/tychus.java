package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class tychus extends AppCompatActivity {
Intent tychus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tychus);
    }

    public void acttyc(View view) {

        switch (view.getId()) {
            case R.id.btycwol:
                tychus = new Intent(this, tychuswol.class);
                startActivity(tychus); break;
            case R.id.btyclotv:
                tychus = new Intent(this, tychuslotv.class);
                startActivity(tychus); break;
        }
    }
}
