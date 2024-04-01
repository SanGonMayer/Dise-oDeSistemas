package domain;

import java.util.List;

public class Alumno {
    private List <Materia> materiasAprobadas;

    public boolean tieneAprobadas(List <Materia> unasMaterias){
        return materiasAprobadas.containsAll(unasMaterias);
    }
}