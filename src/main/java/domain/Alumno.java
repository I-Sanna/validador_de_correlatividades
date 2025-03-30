package domain;

import java.util.HashSet;

public class Alumno {
    private String nombre;
    private String legajo;
    private HashSet<Materia> materiasAprobadas;

    public Alumno(String nombre, String legajo, HashSet<Materia> materiasAprobadas){
        this.nombre = nombre;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean aproboMaterias(HashSet<Materia> materias){
        return materiasAprobadas.containsAll(materias);
    }
}
