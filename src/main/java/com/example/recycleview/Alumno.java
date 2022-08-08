package com.example.recycleview;

import java.io.Serializable;
import java.util.ArrayList;

public class Alumno implements Serializable {
    private int id;
    private String carrera;
    private String nombre;
    private String img;
    private String matricula;

    public Alumno(int id, String carrera, String nombre, String img, String matricula) {
        this.setId(id);
        this.setGrados(carrera);
        this.setNombre(nombre);
        this.setImg(img);
        this.setMatricula(matricula);
    }

    public Alumno() {

    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getGrados() {
        return carrera;
    }

    public void setGrados(String carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /*
    public static ArrayList<Alumno> llenarAlumnos(){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String carrera = "Ing. Tec. de la Informacion";
        alumnos.add(new Alumno(1,carrera, "PERAZA SAINZ ANGEL ADRIAN", R.drawable.a01, "2018030155"));
        alumnos.add(new Alumno(2,carrera, "GOMEZ CAMARENA JOSE RICARDO", R.drawable.a02, "2017030274"));
        alumnos.add(new Alumno(3,carrera, "PEÑA SOLIS DIEGO ARMANDO", R.drawable.a03, "2017030432"));
        alumnos.add(new Alumno(4,carrera, "GARCIA SILVA ADRIAN", R.drawable.a04, "2018030098"));
        alumnos.add(new Alumno(5,carrera, "GARCIA RODRIGUEZ JESUS EFRAIN", R.drawable.a05, "2018030099"));
        alumnos.add(new Alumno(6,carrera, "LIZARRAGA CAMACHO JESUS ARMANDO", R.drawable.a06, "2018030103"));
        alumnos.add(new Alumno(7,carrera, "GARCIA GOMEZ JUAN ANTONIO", R.drawable.a07, "2018030108"));
        alumnos.add(new Alumno(8,carrera, "LIZARRAGA LUNA JUAN FRANCISCO", R.drawable.a08, "2018030119"));
        alumnos.add(new Alumno(9,carrera, "OSUNA HIGUERA ALEJANDRO", R.drawable.a09, "2018030121"));
        alumnos.add(new Alumno(10,carrera, "MARIN GALINDO KIMBERLY VANESSA", R.drawable.a10, "2018030133"));
        return alumnos;
    } */
}
