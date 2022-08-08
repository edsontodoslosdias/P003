package com.example.recycleview;

import android.app.Application;
import android.util.Log;

import java.util.ArrayList;

import database.AlumnoDbHelper;
import database.AlumnosDb;

public class Aplicacion extends Application {
    public static ArrayList<Alumno> alumnos;
    private MiAdaptador adaptador;
    private AlumnosDb alumnosDb;

    private AlumnoDbHelper helper = new AlumnoDbHelper(this);
    private AlumnosDb alumnoDb = new AlumnosDb(this, helper);

    public static ArrayList<Alumno> getAlumnos() { return alumnos;}

    public MiAdaptador getAdaptador(){ return adaptador; }

    @Override
    public void onCreate(){
        super.onCreate();
        alumnoDb.openDatabase();
        alumnosDb = new AlumnosDb(getApplicationContext());
        alumnos = alumnosDb.allAlumnos();
        //alumnos = Alumno.llenarAlumnos();
        adaptador = new MiAdaptador(alumnos, this);
        //Log.d("", "onCreate: tamaño array list " + alumnos.size());
        alumnoDb.closeDatabase();
    }
}
