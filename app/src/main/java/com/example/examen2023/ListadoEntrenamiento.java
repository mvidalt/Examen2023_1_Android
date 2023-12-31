package com.example.examen2023;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class ListadoEntrenamiento extends Fragment {

    public ListadoEntrenamiento() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_listado_entrenamientos, container, false);
        return view;
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ListView myListView = view.findViewById(R.id.myListView);

        String[] datos = {"Extremidades a tope", "Agonia Maxima", "Entrenamiento Especial", "Fuerza y longitud"};


        CustomListAdapter adapter = new CustomListAdapter(requireContext(), datos);

        myListView.setAdapter(adapter);

        myListView.setOnItemClickListener((parent, view1, position, id) -> {
            String selectedExercise = datos[position];
            ((MainActivity) requireActivity()).openDetalleFragment(selectedExercise);
        });
    }


}