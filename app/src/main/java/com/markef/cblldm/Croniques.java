package com.markef.cblldm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Croniques extends AppCompatActivity {

    private DatabaseReference mDatabase;

    TextView tVjornada;

    //Senior 1 Masc
    TextView tVsenior1m,tVresultat1senior1m,tVresultat2senior1m,tVcronicasenior1m;
    //Senior Fem
    TextView tVsenior1f,tVresultat1seniorf,tVresultat2seniorf,tVcronicaseniorf;
    //Senior 2 Masc
    TextView tVsenior2m,tVresultat1senior2m,tVresultat2senior2m,tVcronicasenior2m;
    //Senior 3 Masc
    TextView tVsenior3m,tVresultat1senior3m,tVresultat2senior3m,tVcronicasenior3m;
    //Sots21 Masc
    TextView tVs21m,tVresultat1sots21,tVresultat2sots21,tVcronicasots21;
    //Junior Inter Masc
    TextView tVjunior1m,tVresultat1junior1m,tVresultat2junior1m,tVcronicajunior1m;
    //Junior Primer Any Masc
    TextView tVjunior2m,tVresultat1junior2m,tVresultat2junior2m,tVcronicajunior2m;
    //Junior 1 Femeni
    TextView tVjunior1f,tVresultat1junior1f,tVresultat2junior1f,tVcronicajunior1f;
    //Junior 2 Femeni
    TextView tVjunior2f,tVresultat1junior2f,tVresultat2junior2f,tVcronicajunior2f;
    //Cadet Femeni
    TextView tVcadetf,tVresultat1cadetf,tVresultat2cadetf,tVcronicacadetf;
    //Cadet Masculi
    TextView tVcadetm,tVresultat1cadetm,tVresultat2cadetm,tVcronicacadetm;
    //Infantil Femeni
    TextView tVinfantilf,tVresultat1infantilf,tVresultat2infantilf,tVcronicainfantilf;
    //Infantil Masculi
    TextView tVinfantilm,tVresultat1infantilm,tVresultat2infantilm,tVcronicainfantilm;
    //Pre-infantil Femeni
    TextView tVpreinfantilf,tVresultat1preinfantilf,tVresultat2preinfantilf,tVcronicapreinfantilf;
    //Mini Femeni
    TextView tVminif,tVresultat1minif,tVresultat2minif,tVcronicaminif;
    //Mini Masculi
    TextView tVminim,tVresultat1minim,tVresultat2minim,tVcronicaminim;

    Button bTback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_croniques);

        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        //Obtenir base de dades
        mDatabase = FirebaseDatabase.getInstance().getReference();

        tVjornada = findViewById(R.id.tVjornada);

        mDatabase.child("Jornada").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Data = dataSnapshot.child("Data").getValue().toString();
                    tVjornada.setText(Data);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //SENIOR 1 MASC
        tVresultat1senior1m = findViewById(R.id.tVresultat1senior1m);
        tVresultat2senior1m = findViewById(R.id.tVresultat2senior1m);
        tVcronicasenior1m = findViewById(R.id.tVcronicasenior1m);
        tVsenior1m = findViewById(R.id.tVsenior1m);

        mDatabase.child("Senior1M").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1senior1m.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2senior1m.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicasenior1m.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVsenior1m.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVsenior1m.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVsenior1m.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //SENIOR FEM
        tVresultat1seniorf = findViewById(R.id.tVresultat1seniorf);
        tVresultat2seniorf = findViewById(R.id.tVresultat2seniorf);
        tVcronicaseniorf = findViewById(R.id.tVcronicaseniorf);
        tVsenior1f = findViewById(R.id.tVsenior1f);

        mDatabase.child("Senior1F").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1seniorf.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2seniorf.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicaseniorf.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVsenior1f.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVsenior1f.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVsenior1f.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //SENIOR 2 MASC
        tVresultat1senior2m = findViewById(R.id.tVresultat1senior2m);
        tVresultat2senior2m = findViewById(R.id.tVresultat2senior2m);
        tVcronicasenior2m = findViewById(R.id.tVcronicasenior2m);
        tVsenior2m = findViewById(R.id.tVsenior2m);

        mDatabase.child("Senior2M").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1senior2m.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2senior2m.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicasenior2m.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVsenior2m.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVsenior2m.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVsenior2m.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //SENIOR 3 MASC
        tVresultat1senior3m = findViewById(R.id.tVresultat1seniorp);
        tVresultat2senior3m = findViewById(R.id.tVresultat2seniorp);
        tVcronicasenior3m = findViewById(R.id.tVcronicaseniorp);
        tVsenior3m = findViewById(R.id.tVsenior3m);

        mDatabase.child("Senior3M").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1senior3m.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2senior3m.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicasenior3m.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVsenior3m.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVsenior3m.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVsenior3m.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //SOTS21 MASC
        tVresultat1sots21 = findViewById(R.id.tVresultat1sots21);
        tVresultat2sots21 = findViewById(R.id.tVresultat2sots21);
        tVcronicasots21 = findViewById(R.id.tVcronicasots21);
        tVs21m = findViewById(R.id.tVs21m);

        mDatabase.child("Sots21M").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1sots21.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2sots21.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicasots21.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVs21m.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVs21m.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVs21m.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //JUNIOR INTER MASC
        tVresultat1junior1m = findViewById(R.id.tVresultat1junior1m);
        tVresultat2junior1m = findViewById(R.id.tVresultat2junior1m);
        tVcronicajunior1m = findViewById(R.id.tVcronicajunior1m);
        tVjunior1m = findViewById(R.id.tVjunior1m);

        mDatabase.child("Junior1M").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1junior1m.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2junior1m.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicajunior1m.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVjunior1m.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVjunior1m.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVjunior1m.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //JUNIOR PRIMER ANY MASC
        tVresultat1junior2m = findViewById(R.id.tVresultat1junior2m);
        tVresultat2junior2m = findViewById(R.id.tVresultat2junior2m);
        tVcronicajunior2m = findViewById(R.id.tVcronicajunior2m);
        tVjunior2m = findViewById(R.id.tVjunior2m);

        mDatabase.child("Junior2M").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1junior2m.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2junior2m.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicajunior2m.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVjunior2m.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVjunior2m.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVjunior2m.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //JUNIOR A FEMENI
        tVresultat1junior1f = findViewById(R.id.tVresultat1junior1f);
        tVresultat2junior1f = findViewById(R.id.tVresultat2junior1f);
        tVcronicajunior1f = findViewById(R.id.tVcronicajunior1f);
        tVjunior1f = findViewById(R.id.tVjunior1f);

        mDatabase.child("Junior1F").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1junior1f.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2junior1f.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicajunior1f.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVjunior1f.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVjunior1f.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVjunior1f.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //JUNIOR B FEMENI
        tVresultat1junior2f = findViewById(R.id.tVresultat1junior2f);
        tVresultat2junior2f = findViewById(R.id.tVresultat2junior2f);
        tVcronicajunior2f = findViewById(R.id.tVcronicajunior2f);
        tVjunior2f = findViewById(R.id.tVjunior2f);

        mDatabase.child("Junior2F").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1junior2f.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2junior2f.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicajunior2f.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVjunior2f.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVjunior2f.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVjunior2f.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //CADET FEMENI
        tVresultat1cadetf = findViewById(R.id.tVresultat1cadetf);
        tVresultat2cadetf = findViewById(R.id.tVresultat2cadetf);
        tVcronicacadetf = findViewById(R.id.tVcronicacadetf);
        tVcadetf = findViewById(R.id.tVcadetf);

        mDatabase.child("CadetF").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1cadetf.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2cadetf.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicacadetf.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVcadetf.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVcadetf.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVcadetf.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //CADET MASCULI
        tVresultat1cadetm = findViewById(R.id.tVresultat1cadetm);
        tVresultat2cadetm = findViewById(R.id.tVresultat2cadetm);
        tVcronicacadetm = findViewById(R.id.tVcronicacadetm);
        tVcadetm = findViewById(R.id.tVcadetm);

        mDatabase.child("CadetM").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1cadetm.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2cadetm.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicacadetm.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVcadetm.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVcadetm.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVcadetm.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //INFANTIL FEMENI
        tVresultat1infantilf = findViewById(R.id.tVresultat1infantilf);
        tVresultat2infantilf = findViewById(R.id.tVresultat2infantilf);
        tVcronicainfantilf = findViewById(R.id.tVcronicainfantilf);
        tVinfantilf = findViewById(R.id.tVinfantilf);

        mDatabase.child("InfantilF").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1infantilf.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2infantilf.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicainfantilf.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVinfantilf.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVinfantilf.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVinfantilf.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //INFANTIL MASCULI
        tVresultat1infantilm = findViewById(R.id.tVresultat1infantilm);
        tVresultat2infantilm = findViewById(R.id.tVresultat2infantilm);
        tVcronicainfantilm = findViewById(R.id.tVcronicainfantilm);
        tVinfantilm = findViewById(R.id.tVinfantilm);

        mDatabase.child("InfantilM").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1infantilm.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2infantilm.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicainfantilm.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVinfantilm.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVinfantilm.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVinfantilm.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //PRE INFANTIL FEMENI
        tVresultat1preinfantilf = findViewById(R.id.tVresultat1preinfantilf);
        tVresultat2preinfantilf = findViewById(R.id.tVresultat2preinfantilf);
        tVcronicapreinfantilf = findViewById(R.id.tVcronicapreinfantilf);
        tVpreinfantilf = findViewById(R.id.tVpreinfantilf);

        mDatabase.child("PreInfantilF").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1preinfantilf.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2preinfantilf.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicapreinfantilf.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVpreinfantilf.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVpreinfantilf.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVpreinfantilf.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //MINI FEMENI
        tVresultat1minif = findViewById(R.id.tVresultat1minif);
        tVresultat2minif = findViewById(R.id.tVresultat2minif);
        tVcronicaminif = findViewById(R.id.tVcronicaminif);
        tVminif = findViewById(R.id.tViminif);

        mDatabase.child("MiniF").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1minif.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2minif.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicaminif.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVminif.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVminif.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVminif.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //MINI MASCULI
        tVresultat1minim = findViewById(R.id.tVresultat1minim);
        tVresultat2minim = findViewById(R.id.tVresultat2minim);
        tVcronicaminim = findViewById(R.id.tVcronicaminim);
        tVminim = findViewById(R.id.tVminim);

        mDatabase.child("MiniM").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                if(dataSnapshot.exists()){
                    String Res1 = dataSnapshot.child("Res1").getValue().toString();
                    tVresultat1minim.setText(Res1);
                    String Res2 = dataSnapshot.child("Res2").getValue().toString();
                    tVresultat2minim.setText(Res2);
                    String Cronica = dataSnapshot.child("Cronica").getValue().toString();
                    tVcronicaminim.setText(Cronica);
                    String Resultat = dataSnapshot.child("Resultat").getValue().toString();

                    if(Resultat.equals("W")){
                        tVminim.setBackground(getDrawable(R.drawable.table_border_green));
                    }else if(Resultat.equals("L")){
                        tVminim.setBackground(getDrawable(R.drawable.table_border_red));
                    }else{
                        tVminim.setBackground(getDrawable(R.drawable.table_border_empty));
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        bTback = findViewById(R.id.bTback);

        bTback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Croniques.this, MainActivity.class);
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
    }}
