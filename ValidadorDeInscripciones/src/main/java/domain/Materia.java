package domain;

import java.util.List;

class Materia {
    private List<Materia> correlativas;

    // Getters and setters
    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }
}