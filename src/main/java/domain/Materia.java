package domain;

import java.util.HashSet;

public class Materia {
    private String nombre;
    private HashSet<Materia> correlativas;

    public Materia(String nombre, HashSet<Materia> correlativas){
        this.nombre = nombre;
        this.correlativas = correlativas;
    }

    public HashSet<Materia> correlativas() {
        return correlativas;
    }
}
