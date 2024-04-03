package domain;

import java.util.List;

class Inscripcion {
    private Alumno alumno;
    private List<Materia> materias;

    public boolean aprobada() {
        return materias.stream().allMatch(materia ->
                alumno.tieneAprobadas(materia.getCorrelativas()));
    }

    // Getters and setters
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }
}