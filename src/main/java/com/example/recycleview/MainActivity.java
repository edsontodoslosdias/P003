package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private FloatingActionButton fbtnAgregar;
    private Aplicacion app;
    private Alumno alumno;
    private int posicion = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aplicacion app = (Aplicacion) getApplication();
        recyclerView = (RecyclerView) findViewById(R.id.recId);
        recyclerView.setAdapter(app.getAdaptador());

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        fbtnAgregar = (FloatingActionButton) findViewById(R.id.agregarAlumno);

        app.getAdaptador().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int posicion = recyclerView.getChildAdapterPosition(v);
                alumno = app.getAlumnos().get(posicion);

                Intent intent = new Intent(MainActivity.this, activity_alumno_alta.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("alumno",alumno);
                intent.putExtra("posicion", posicion);
                intent.putExtras(bundle);

                startActivityForResult(intent, 1);
                /*
                String dato = app.getAlumnos().get(posicion).getNombre();
                Toast.makeText(MainActivity.this, "Se hizo click en " + dato, Toast.LENGTH_SHORT).show(); */
            }
        });

        fbtnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alumno = null;
                Intent intent = new Intent(MainActivity.this, activity_alumno_alta.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("alumno",alumno);
                bundle.putInt("posicion", posicion);
                intent.putExtras(bundle);

                startActivityForResult(intent, 0);
                //Toast.makeText(MainActivity.this, "Uno Nuevo",Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);
        recyclerView.getAdapter().notifyDataSetChanged();
        posicion = -1;
    }
}