package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
public class terran extends AppCompatActivity {
    Intent terran;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terran);
    }
    public void actterran(View view) {

        switch (view.getId()) {

            case R.id.basp:
                terran = new Intent(this, aspid.class);
                startActivity(terran);
                break;
            case R.id.bban:
                terran = new Intent(this, banshee.class);
                startActivity(terran);
                break;
            case R.id.bvalk:
                terran = new Intent(this, valkyrie.class);
                startActivity(terran);
                break;
            case R.id.bvik:
                terran = new Intent(this, viking.class);
                startActivity(terran);
                break;
            case R.id.brav:
                terran = new Intent(this, raven.class);
                startActivity(terran);
                break;
            case R.id.bmira:
                terran = new Intent(this, mira.class);
                startActivity(terran);
                break;
            case R.id.bhel:
                terran = new Intent(this, hellion.class);
                startActivity(terran);
                break;
            case R.id.bher:
                terran = new Intent(this, hercules.class);
                startActivity(terran);
                break;
            case R.id.bgol:
                terran = new Intent(this, goliath.class);
                startActivity(terran);
                break;
            case R.id.breap:
                terran = new Intent(this, reaper.class);
                startActivity(terran);
                break;
            case R.id.bbc:
                terran = new Intent(this, bc.class);
                startActivity(terran);
                break;
            case R.id.bscv:
                terran = new Intent(this, scv.class);
                startActivity(terran);
                break;
            case R.id.bmarod:
                terran = new Intent(this, maroder.class);
                startActivity(terran);
                break;
        }
    }
}