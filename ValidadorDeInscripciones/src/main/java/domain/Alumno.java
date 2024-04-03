package domain;

import domain.Materia;

import java.util.List;

class Alumno {
    private List<Materia> materiasAprobadas;

    public boolean tieneAprobadas(List<Materia> materias) {
        return materiasAprobadas.containsAll(materias);
    }

    // Getters and setters
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}