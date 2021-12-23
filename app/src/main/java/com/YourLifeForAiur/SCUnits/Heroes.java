package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Heroes extends AppCompatActivity{
Intent heroes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);

    }

    public void act(View view) {

        switch (view.getId()) {

            case R.id.bkerr:
                heroes = new Intent(this, kerrigan.class);
                startActivity(heroes); break;
            case R.id.bray:
                heroes = new Intent(this, raynor.class);
                startActivity(heroes); break;
            case R.id.bnov:
                heroes = new Intent(this, nova.class);
                startActivity(heroes); break;
            case R.id.bzer:
                heroes = new Intent(this, zeratul.class);
                startActivity(heroes); break;
            case R.id.btyc:
                heroes = new Intent(this, tychus.class);
                startActivity(heroes); break;
            case R.id.btosh:
                heroes = new Intent(this, tosh.class);
                startActivity(heroes); break;
            case R.id.bstuk:
                heroes = new Intent(this, stukov.class);
                startActivity(heroes); break;
            case R.id.barta:
                heroes = new Intent(this, artanis.class);
                startActivity(heroes); break;
            case R.id.bvor:
                heroes = new Intent(this, vorazun.class);
                startActivity(heroes); break;
            case R.id.bfen:
                heroes = new Intent(this, fenix.class);
                startActivity(heroes); break;
            case R.id.balar:
                heroes = new Intent(this, alarak.class);
                startActivity(heroes); break;
            case R.id.bswa:
                heroes = new Intent(this, swann.class);
                startActivity(heroes); break;
            case R.id.bzag:
                heroes = new Intent(this, zagara.class);
                startActivity(heroes); break;
            case R.id.bmoh:
                heroes = new Intent(this, mohandar.class);
                startActivity(heroes); break;
            case R.id.bsel:
                heroes = new Intent(this, selendis.class);
                startActivity(heroes); break;
            case R.id.bdeh:
                heroes = new Intent(this, dehaka.class);
                startActivity(heroes); break;
            case R.id.burun:
                heroes = new Intent(this, urun.class);
                startActivity(heroes); break;
            case R.id.btas:
                heroes = new Intent(this, tassadar.class);
                startActivity(heroes); break;
            case R.id.bhyp:
                heroes = new Intent(this, hyperion.class);
                startActivity(heroes); break;
            case R.id.bstet:
                heroes = new Intent(this, stetmann.class);
                startActivity(heroes); break;
            case R.id.bgary:
                heroes = new Intent(this, gary.class);
                startActivity(heroes); break;
            case R.id.bduk:
                heroes = new Intent(this, duke.class);
                startActivity(heroes); break;
            case R.id.bdur:
                heroes = new Intent(this, duran.class);
                startActivity(heroes); break;
            case R.id.bkarax:
                heroes = new Intent(this, karax.class);
                startActivity(heroes); break;
            case R.id.bbal:
                heroes = new Intent(this, balius.class);
                startActivity(heroes); break;
            case R.id.bkar:
                heroes = new Intent(this, karass.class);
                startActivity(heroes); break;
        }

    }
}
