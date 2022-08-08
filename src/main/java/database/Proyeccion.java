package database;

import android.database.Cursor;

import com.example.recycleview.Alumno;

import java.util.ArrayList;

public interface Proyeccion{
    public Alumno getAlumno(String matricula);
    public ArrayList<Alumno> allAlumnos();
    public Alumno readAlumno(Cursor cursor);
}
