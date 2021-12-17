package com.YourLifeForAiur.SCUnits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Heroes extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes);
        Button bkerr = (Button) findViewById(R.id.bkerr);
        bkerr.setOnClickListener(this);
        Button bnov = (Button) findViewById(R.id.bnov);
        bnov.setOnClickListener(this);
        Button bray = (Button) findViewById(R.id.bray);
        bray.setOnClickListener(this);
        Button bzer = (Button) findViewById(R.id.bzer);
        bzer.setOnClickListener(this);
        Button btyc = (Button) findViewById(R.id.btyc);
        btyc.setOnClickListener(this);
        Button btosh = (Button) findViewById(R.id.btosh);
        btosh.setOnClickListener(this);
        Button bstuk = (Button) findViewById(R.id.bstuk);
        bstuk.setOnClickListener(this);
        Button barta = (Button) findViewById(R.id.barta);
        barta.setOnClickListener(this);
        Button bvor = (Button) findViewById(R.id.bvor);
        bvor.setOnClickListener(this);
        Button bfen = (Button) findViewById(R.id.bfen);
        bfen.setOnClickListener(this);
        Button balar = (Button) findViewById(R.id.balar);
        balar.setOnClickListener(this);
        Button bswa = (Button) findViewById(R.id.bswa);
        bswa.setOnClickListener(this);
        Button bzag = (Button) findViewById(R.id.bzag);
        bzag.setOnClickListener(this);
        Button bmoh = (Button) findViewById(R.id.bmoh);
        bmoh.setOnClickListener(this);
        Button bsel = (Button) findViewById(R.id.bsel);
        bsel.setOnClickListener(this);
        Button bdeh = (Button) findViewById(R.id.bdeh);
        bdeh.setOnClickListener(this);
        Button burun = (Button) findViewById(R.id.burun);
        burun.setOnClickListener(this);
        Button btas = (Button) findViewById(R.id.btas);
        btas.setOnClickListener(this);
        Button bhyp = (Button) findViewById(R.id.bhyp);
        bhyp.setOnClickListener(this);
        Button bstet = (Button) findViewById(R.id.bstet);
        bstet.setOnClickListener(this);
        Button bgary = (Button) findViewById(R.id.bgary);
        bgary.setOnClickListener(this);
        Button bduk = (Button) findViewById(R.id.bduk);
        bduk.setOnClickListener(this);
        Button bdur = (Button) findViewById(R.id.bdur);
        bdur.setOnClickListener(this);
        Button bkar = (Button) findViewById(R.id.bkar);
        bkar.setOnClickListener(this);
        Button bbal = (Button) findViewById(R.id.bbal);
        bbal.setOnClickListener(this);
        Button bkarax = (Button) findViewById(R.id.bkarax);
        bkarax.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.bkerr:
                Intent kerr;
                kerr = new Intent(this, kerrigan.class);
                startActivity(kerr);
                break;

            case R.id.bnov:
                Intent nov;
                nov = new Intent(this, nova.class);
                startActivity(nov);
                break;
            case R.id.bray:
                Intent ray;
                ray = new Intent(this, raynor.class);
                startActivity(ray);
                break;
            case R.id.bzer:
                Intent zer;
                zer = new Intent(this, zeratul.class);
                startActivity(zer);
                break;
            case R.id.btyc:
                Intent tyc;
                tyc = new Intent(this, tychus.class);
                startActivity(tyc);
                break;
            case R.id.btosh:
                Intent tosh;
                tosh = new Intent(this, tosh.class);
                startActivity(tosh);
                break;
            case R.id.bstuk:
                Intent stuk;
                stuk = new Intent(this, stukov.class);
                startActivity(stuk);
                break;
            case R.id.barta:
                Intent arta;
                arta = new Intent(this, artanis.class);
                startActivity(arta);
                break;
            case R.id.bvor:
                Intent vor;
                vor = new Intent(this, vorazun.class);
                startActivity(vor);
                break;
            case R.id.bfen:
                Intent fen;
                fen = new Intent(this, fenix.class);
                startActivity(fen);
                break;
            case R.id.balar:
                Intent alar;
                alar = new Intent(this, alarak.class);
                startActivity(alar);
                break;
            case R.id.bswa:
                Intent swa;
                swa = new Intent(this, swann.class);
                startActivity(swa);
                break;
            case R.id.bzag:
                Intent zag;
                zag = new Intent(this, zagara.class);
                startActivity(zag);
                break;
            case R.id.bmoh:
                Intent moh;
                moh = new Intent(this, mohandar.class);
                startActivity(moh);
                break;
            case R.id.bsel:
                Intent sel;
                sel = new Intent(this, selendis.class);
                startActivity(sel);
                break;
            case R.id.bdeh:
                Intent deh;
                deh = new Intent(this, dehaka.class);
                startActivity(deh);
                break;
            case R.id.burun:
                Intent urun;
                urun = new Intent(this, urun.class);
                startActivity(urun);
                break;
            case R.id.btas:
                Intent tas;
                tas = new Intent(this, tassadar.class);
                startActivity(tas);
                break;
            case R.id.bhyp:
                Intent hyp;
                hyp = new Intent(this, hyperion.class);
                startActivity(hyp);
                break;
            case R.id.bstet:
                Intent stet;
                stet = new Intent(this, stetmann.class);
                startActivity(stet);
                break;
            case R.id.bgary:
                Intent gary;
                gary = new Intent(this, gary.class);
                startActivity(gary);
                break;
            case R.id.bduk:
                Intent duk;
                duk = new Intent(this, duke.class);
                startActivity(duk);
                break;
            case R.id.bdur:
                Intent dur;
                dur = new Intent(this, duran.class);
                startActivity(dur);
                break;
            case R.id.bkar:
                Intent kar;
                kar = new Intent(this, karass.class);
                startActivity(kar);
                break;
            case R.id.bbal:
                Intent bal;
                bal = new Intent(this, balius.class);
                startActivity(bal);
                break;
            case R.id.bkarax:
                Intent karax;
                karax = new Intent(this, artanis.class);
                startActivity(karax);
                break;
            default:
                break;
        }

    }
}
