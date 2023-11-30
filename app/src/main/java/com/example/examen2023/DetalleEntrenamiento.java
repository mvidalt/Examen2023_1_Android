package com.example.examen2023;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class DetalleEntrenamiento extends Fragment {

    public DetalleEntrenamiento() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle_entrenamiento, container, false);

        Bundle bundle = getArguments();
        if (bundle != null) {
            String exerciseName = bundle.getString("exerciseName");

            if (exerciseName != null) {
                ConstraintLayout parentLayout = view.findViewById(R.id.parentLayout);



                if (exerciseName.equals("Extremidades a tope")) {
                    LinearLayout layoutEntrenamiento1 = view.findViewById(R.id.layoutEntrenamiento1);
                    layoutEntrenamiento1.setVisibility(View.VISIBLE);
                } else if (exerciseName.equals("Agonia Maxima")) {
                    LinearLayout layoutEntrenamiento2 = view.findViewById(R.id.layoutEntrenamiento2);
                    layoutEntrenamiento2.setVisibility(View.VISIBLE);
                } else if (exerciseName.equals("Entrenamiento Especial")){
                    LinearLayout layoutEntrenamiento3 = view.findViewById(R.id.layoutEntrenamiento3);
                    layoutEntrenamiento3.setVisibility(View.VISIBLE);
                }else if (exerciseName.equals("Fuerza y longitud")){
                    LinearLayout layoutEntrenamiento4 = view.findViewById(R.id.layoutEntrenamiento4);
                    layoutEntrenamiento4.setVisibility(View.VISIBLE);
                }
            }
        }

        return view;
    }

    private void hideAllSections(ConstraintLayout parentLayout) {
        for (int i = 0; i < parentLayout.getChildCount(); i++) {
            View child = parentLayout.getChildAt(i);
            child.setVisibility(View.GONE);
        }
    }
}
