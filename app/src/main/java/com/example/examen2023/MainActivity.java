package com.example.examen2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // Modo Landscape

                ListadoEntrenamiento listadoEntrenamiento = new ListadoEntrenamiento();
                DetalleEntrenamiento detalleEntrenamiento = new DetalleEntrenamiento();

                getSupportFragmentManager().beginTransaction()
                        .add(R.id.fragment_container, listadoEntrenamiento)
                        .add(R.id.fragment_detail_container, detalleEntrenamiento)
                        .commit();

        } else {
            // Modo Normal
            ListadoEntrenamiento listadoEntrenamiento = new ListadoEntrenamiento();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, listadoEntrenamiento)
                    .commit();
        }
    }

    public void openDetalleFragment(String exerciseName) {
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //Modo Landscape
            DetalleEntrenamiento detalleFragment = new DetalleEntrenamiento();

            Bundle bundle = new Bundle();
            bundle.putString("exerciseName", exerciseName);

            detalleFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_detail_container, detalleFragment)
                    .commit();
        } else {
            //Modo Normal
            DetalleEntrenamiento detalleFragment = new DetalleEntrenamiento();

            Bundle bundle = new Bundle();
            bundle.putString("exerciseName", exerciseName);

            detalleFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, detalleFragment)
                    .addToBackStack(null)
                    .commit();
        }
    }

}
