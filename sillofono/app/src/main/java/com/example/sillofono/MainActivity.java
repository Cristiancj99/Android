package com.example.sillofono;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayerDO;
    MediaPlayer mediaPlayerRE;
    MediaPlayer mediaPlayerMI;
    MediaPlayer mediaPlayerFA;
    MediaPlayer mediaPlayerSOL;
    MediaPlayer mediaPlayerLA;
    MediaPlayer mediaPlayerSI;
    boolean muteado;
    int contador=0;
    ImageButton DO;
    ImageButton RE;
    ImageButton MI;
    ImageButton FA;
    ImageButton SOL;
    ImageButton LA;
    ImageButton SI;
    ImageButton muted;
    private View.OnClickListener actividad_boton_DO =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!muteado)
                mediaPlayerDO.start();
        }
    };
    private View.OnClickListener actividad_boton_RE =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!muteado)
                mediaPlayerRE.start();
        }
    };
    private View.OnClickListener actividad_boton_MI =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!muteado)
                mediaPlayerMI.start();
        }
    };    private View.OnClickListener actividad_boton_FA =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!muteado)
                mediaPlayerFA.start();
        }
    };    private View.OnClickListener actividad_boton_SOL =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!muteado)
                mediaPlayerSOL.start();
        }
    };    private View.OnClickListener actividad_boton_LA =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!muteado)
                mediaPlayerLA.start();
        }
    };    private View.OnClickListener actividad_boton_SI =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if (!muteado)
             mediaPlayerSI.start();
        }
    };

    private View.OnClickListener actividad_boton_muted =  new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(contador==0){
                muteado=true;
                contador++;
            }
            else if(contador==1){
                muteado=false;
                contador--;
            }
        }
    };




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         mediaPlayerDO = MediaPlayer.create(this, R.raw.note1);
         mediaPlayerRE = MediaPlayer.create(this, R.raw.note2);
         mediaPlayerMI = MediaPlayer.create(this, R.raw.note3);
         mediaPlayerFA = MediaPlayer.create(this, R.raw.note4);
         mediaPlayerSOL = MediaPlayer.create(this, R.raw.note5);
         mediaPlayerLA= MediaPlayer.create(this, R.raw.note6);
         mediaPlayerSI = MediaPlayer.create(this, R.raw.note7);
        muted =findViewById(R.id.btnMuted);
        muted.setOnClickListener(actividad_boton_muted);
        if(!muteado) {
            DO = findViewById(R.id.buttonDO);
            DO.setOnClickListener(actividad_boton_DO);
            RE = findViewById(R.id.buttonRE);
            RE.setOnClickListener(actividad_boton_RE);
            MI = findViewById(R.id.buttonMI);
            MI.setOnClickListener(actividad_boton_MI);
            FA = findViewById(R.id.buttonFA);
            FA.setOnClickListener(actividad_boton_FA);
            SOL = findViewById(R.id.buttonSOL);
            SOL.setOnClickListener(actividad_boton_SOL);
            LA = findViewById(R.id.buttonLA);
            LA.setOnClickListener(actividad_boton_LA);
            SI = findViewById(R.id.buttonSI);
            SI.setOnClickListener(actividad_boton_SI);
        }




    }
}