package com.example.examen2023;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListadoEntrenamiento extends Fragment {

    public ListadoEntrenamiento() {
        // Constructor por defecto requerido
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflar el diseño del fragmento
        View view = inflater.inflate(R.layout.fragment_listado_entrenamientos, container, false);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView myListView = view.findViewById(R.id.myListView);


        String[] datos = {"Extremidades a tope", "Agonia Maxima", "Entrenamiento Especial", "Fuerza y longitud"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(),
                android.R.layout.simple_list_item_1, datos);

        myListView.setAdapter(adapter);
    }
}