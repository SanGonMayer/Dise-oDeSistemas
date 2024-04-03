package domain;

import domain.Alumno;
import domain.Materia;

import java.util.List;

class InscripcionTest {

    static void comprobacionInscripcion() {
        Alumno alumno = new Alumno();
        Materia materia1 = new Materia();
        Materia materia2 = new Materia();
        materia2.setCorrelativas(List.of(materia1));
        Inscripcion inscripcion = new Inscripcion();

        // aprobación de inscripción
        alumno.setMateriasAprobadas(List.of(materia1));
        inscripcion.setAlumno(alumno);
        inscripcion.setMaterias(List.of(materia2));
        boolean resultadoEsperado = true;
        boolean resultadoObtenido = inscripcion.aprobada();
        verificar(resultadoEsperado, resultadoObtenido);

        // rechazo de inscripción
        alumno.setMateriasAprobadas(List.of());
        inscripcion.setAlumno(alumno);
        resultadoEsperado = false;
        resultadoObtenido = inscripcion.aprobada();
        verificar(resultadoEsperado, resultadoObtenido);
    }

    static void verificar(boolean esperado, boolean obtenido) {
        if (esperado == obtenido) {
            System.out.println("aprobada");
        } else {
            System.out.println("rechazada");
        }
    }

    public static void main(String[] args) {
        comprobacionInscripcion();
    }
}
