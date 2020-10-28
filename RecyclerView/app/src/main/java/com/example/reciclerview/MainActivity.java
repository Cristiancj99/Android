package com.example.reciclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inicialización de la lista de datos de ejemplo
        ArrayList<equipoFutbol> datos = new ArrayList<equipoFutbol>();
        for(int i=0; i<50; i++)
            datos.add(new equipoFutbol("Real Madrid" + i, "Santiago Bernabeu" + i,  "Zidadine Zidane"));

        //Inicialización RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(false);

        //Crea el adaptador, pasándole como parámetro los datos
        final equipoFutbolAdapter adaptador = new equipoFutbolAdapter(datos);

        //Asocia a recylerView el adaptador
        recyclerView.setAdapter(adaptador);

        //Fija un layout linear al recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}