package com.example.reciclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class equipoFutbolAdapter
        extends RecyclerView.Adapter<equipoFutbolAdapter.equipoFutbolViewHolder> {

        /*Arraylist donde almaceno los datos que se van a mostrar en el RecylerView*/
        private ArrayList<equipoFutbol> datos;

        /* Incluyo el Viewholder en el Adapter */
        public static class equipoFutbolViewHolder
                extends RecyclerView.ViewHolder {
            /* Como atributos se incluyen los elementos que van a referenciar a los elementos de la vista*/
            private TextView tvNombre;
            private TextView tvEstadio;
            private TextView tvEntrenador;

            /*constructor con parámetro de la vista*/
            public equipoFutbolViewHolder(View itemView) {
                super(itemView);
                // Asocia los atributos a los widgets del layout de la vista
                tvNombre = (TextView)itemView.findViewById(R.id.tvNombre);
                tvEstadio = (TextView)itemView.findViewById(R.id.tvEstadio);
                tvEntrenador = (TextView)itemView.findViewById(R.id.tvEntrenador);

            }

            /*Muestra los datos de coche en el item*/
            public void bindCoche(equipoFutbol equipo) {
                tvNombre.setText(equipo.getNombre_equipo());
                tvEstadio.setText(equipo.getEstadio());
                tvEntrenador.setText(equipo.getEntrenador());
            }
        }


        /* Constructor con parámetros*/
    public equipoFutbolAdapter(ArrayList<equipoFutbol> datos) {
            this.datos = datos;
        }

        @Override
        public equipoFutbolViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
            /*Crea la vista de un item y la "pinta"*/
            View itemView = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_equipo, viewGroup, false);
            /* Crea un objeto de la clase CocheViewHolder, pasándole la vista anteriormente creada*/
            equipoFutbolViewHolder equipoVH = new equipoFutbolViewHolder(itemView);
            /* devuelve la vissta*/
            return equipoVH;
        }

        @Override
        public void onBindViewHolder(equipoFutbolViewHolder viewHolder, int pos) {
            equipoFutbol equipo = datos.get(pos);
            /* Llama a bindCoche, para que "pinte" los datos del coche que se le pasa como parámetro*/
            viewHolder.bindCoche(equipo);
        }

        @Override
        public int getItemCount() {
            return datos.size();
        }


}

