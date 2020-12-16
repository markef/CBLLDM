package com.markef.cblldm;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PrimerEquip extends AppCompatActivity {

    Button bTback, bTfeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primer_equip);

        bTback = findViewById(R.id.bTback);
        bTfeb = findViewById(R.id.bTfeb);

        bTback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimerEquip.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void openFEB(View view) {
        Uri uri = Uri.parse("https://baloncestoenvivo.feb.es/equipo/848640");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}