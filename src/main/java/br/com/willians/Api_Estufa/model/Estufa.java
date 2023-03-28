package br.com.willians.Api_Estufa.model;

import br.com.willians.Api_Estufa.model.enuns.Status;

public class Estufa {

    private Long id;
    private Status statusEstufa;
    private Metragem metragemEstufa;
    private Rua rua;

    public Estufa(Long id, Status statusEstufa, Metragem metragemEstufa, Rua rua) {
        this.id = id;
        this.statusEstufa = statusEstufa;
        this.metragemEstufa = metragemEstufa;
        this.rua = rua;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Status getStatusEstufa() {
        return statusEstufa;
    }

    public void setStatusEstufa(Status statusEstufa) {
        this.statusEstufa = statusEstufa;
    }

    public Metragem getMetragemEstufa() {
        return metragemEstufa;
    }

    public void setMetragemEstufa(Metragem metragemEstufa) {
        this.metragemEstufa = metragemEstufa;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }
}
