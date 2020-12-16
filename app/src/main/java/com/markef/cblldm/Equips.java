package com.markef.cblldm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Equips extends AppCompatActivity {

    Button bTback, bTjuniorf, bTcadetem, bTcadetef, bTsenior2m, bTinfantilm, bTinfantilf, bTminim, bTminif, bTjuniorm, bTsenior1m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equips);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        //MASCULINS

        bTsenior1m = findViewById(R.id.bTsenior1m);
        bTsenior2m = findViewById(R.id.bTsenior2m);
        bTcadetem = findViewById(R.id.bTcadetm);
        bTinfantilm = findViewById(R.id.bTinfantilm);
        bTminim = findViewById(R.id.bTminim);
        bTjuniorm = findViewById(R.id.bTjuniorm);

        //FEMENINS

        bTjuniorf = findViewById(R.id.bTjuniorf);
        bTcadetef = findViewById(R.id.bTcadetf);
        bTinfantilf = findViewById(R.id.bTinfantilf);
        bTminif = findViewById(R.id.bTminif);

        bTback = findViewById(R.id.bTback);

        bTsenior1m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, Senior1M.class);
                startActivity(intent);
            }
        });

        bTjuniorf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, JuniorF.class);
                startActivity(intent);
            }
        });

        bTjuniorm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, JuniorM.class);
                startActivity(intent);
            }
        });

        bTinfantilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, InfantilM.class);
                startActivity(intent);
            }
        });

        bTinfantilf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, InfantilF.class);
                startActivity(intent);
            }
        });

        bTcadetef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, CadeteF.class);
                startActivity(intent);
            }
        });

        bTcadetem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, CadeteM.class);
                startActivity(intent);
            }
        });

        bTsenior2m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, Senior2M.class);
                startActivity(intent);
            }
        });

        bTminim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, MiniM.class);
                startActivity(intent);
            }
        });

        bTminif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, MiniF.class);
                startActivity(intent);
            }
        });


        bTback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Equips.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }

    public void openFCBQ(View view) {
        Uri uri = Uri.parse("https://www.basquetcatala.cat/club/272");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}
