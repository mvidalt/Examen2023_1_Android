package com.example.examen2023;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] datos;
    public CustomListAdapter(Context context, String[] datos) {
        super(context, R.layout.list_item_layout, datos);
        this.context = context;
        this.datos = datos;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item_layout, parent, false);

        TextView textView = rowView.findViewById(R.id.exerciseText);
        ImageView imageView = rowView.findViewById(R.id.exerciseIcon);

        textView.setText(datos[position]);

        if (datos[position].equals("Extremidades a tope")) {
            imageView.setImageResource(R.mipmap.ejercicio_1_foreground);
        } else if (datos[position].equals("Agonia Maxima")){
            imageView.setImageResource(R.mipmap.ejercicio_2_foreground);
        }else if (datos[position].equals("Entrenamiento Especial")){
            imageView.setImageResource(R.mipmap.ejercicio_3_foreground);
        }else if (datos[position].equals("Fuerza y longitud")){
            imageView.setImageResource(R.mipmap.ejercicio_4_foreground);
        }

        return rowView;
    }
}
