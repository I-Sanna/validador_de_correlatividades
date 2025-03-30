package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;


class InscripcionTest {

    @Test
    @DisplayName("El alumno cumple con las correlativas")
    public void correlativasAlDia(){
        HashSet<Materia> correlativas = new HashSet<>();
        Materia am = new Materia("Analisis Matematico I", correlativas);
        Materia aga = new Materia("Algebra y Geometria Analitica", correlativas);
        Materia f1 = new Materia("Fisica I", correlativas);
        correlativas.add(am);
        correlativas.add(aga);
        Materia am2 = new Materia("Analisis Matematico II", correlativas);
        correlativas.remove(aga);
        correlativas.add(f1);
        Materia f2 = new Materia("Fisica II", correlativas);

        HashSet<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(f1);
        materiasAprobadas.add(am);
        materiasAprobadas.add(aga);
        Alumno juanita = new Alumno("Juanita", "192.114-7", materiasAprobadas);

        HashSet<Materia> materiasAInscribir = new HashSet<>();
        materiasAInscribir.add(am2);
        materiasAInscribir.add(f2);
        Inscripcion inscripcion = new Inscripcion(juanita, materiasAInscribir);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("El alumno no cumple con las correlativas")
    public void correlativasAtrasadas(){
        HashSet<Materia> correlativas = new HashSet<>();
        Materia am = new Materia("Analisis Matematico I", correlativas);
        Materia aga = new Materia("Algebra y Geometria Analitica", correlativas);
        Materia f1 = new Materia("Fisica I", correlativas);
        correlativas.add(am);
        correlativas.add(aga);
        Materia am2 = new Materia("Analisis Matematico II", correlativas);
        correlativas.remove(aga);
        correlativas.add(f1);
        Materia f2 = new Materia("Fisica II", correlativas);

        HashSet<Materia> materiasAprobadas = new HashSet<>();
        materiasAprobadas.add(am);
        materiasAprobadas.add(aga);
        Alumno juanita = new Alumno("Juanita", "192.114-7", materiasAprobadas);

        HashSet<Materia> materiasAInscribir = new HashSet<>();
        materiasAInscribir.add(am2);
        materiasAInscribir.add(f2);
        Inscripcion inscripcion = new Inscripcion(juanita, materiasAInscribir);

        Assertions.assertFalse(inscripcion.aprobada());
    }


}
