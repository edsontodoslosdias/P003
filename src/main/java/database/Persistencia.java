package database;

import com.example.recycleview.Alumno;

public interface Persistencia {
    public void openDatabase();
    public void closeDatabase();
    public long insertAlumno(Alumno alumno);
    public long updateAlumno(Alumno alumno);
    public void deleteAlumno(int id);
}
