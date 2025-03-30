package domain;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Inscripcion {
    private Alumno alumno;
    private HashSet<Materia> materias;

    public Inscripcion(Alumno alumno, HashSet<Materia> materias){
        this.alumno = alumno;
        this.materias = materias;
    }

    public boolean aprobada(){
        return alumno.aproboMaterias(this.materias
                .stream()
                .map(materia -> materia.correlativas())
                .flatMap(HashSet::stream)
                .collect(Collectors.toCollection(HashSet::new))
        );
    }
}
