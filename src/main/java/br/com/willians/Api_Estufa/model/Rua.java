package br.com.willians.Api_Estufa.model;

public class Rua {

    private Metragem metragem;
    private Integer quantidadeCorredores;

    public Rua(Metragem metragem, Integer quantidadeCorredores) {
        this.metragem = metragem;
        this.quantidadeCorredores = quantidadeCorredores;
    }
}
