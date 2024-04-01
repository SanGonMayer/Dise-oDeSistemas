package domain;

import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada(){
        return this.materias
                .stream()
                .allMatch(unaMateria -> this.alumno.tieneAprobadas(unaMateria.getCorrelativas()));
    }
}