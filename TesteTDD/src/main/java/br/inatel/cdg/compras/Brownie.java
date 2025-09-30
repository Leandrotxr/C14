package br.inatel.cdg.compras;

public class Brownie {

    private String nome;
    private int qtd;
    private double valor;

    public Brownie(String nome, double valor, int qtd) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQtd() {
        return qtd;
    }
}
