package br.com.willians.Api_Estufa.model;

public class Metragem {

    private Float comprimento;
    private Float altura;
    private Float largura;

    public Metragem(Float comprimento, Float altura, Float largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
    }

    public Float getComprimento() {
        return comprimento;
    }

    public void setComprimento(Float comprimento) {
        this.comprimento = comprimento;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getLargura() {
        return largura;
    }

    public void setLargura(Float largura) {
        this.largura = largura;
    }
}
