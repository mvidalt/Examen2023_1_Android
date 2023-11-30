package com.example.examen2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListadoEntrenamiento listadoEntrenamiento = new ListadoEntrenamiento();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, listadoEntrenamiento)
                .commit();
    }
    public void openDetalleFragment(String exerciseName) {
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
