package br.com.bb.zexercicios.compras.modelo;

public class Produto implements Comparable<Produto>{
    private String descricao;
    private double valor;

    public Produto(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return this.getDescricao() + " R$: " + this.getValor();
    }

    // @Override
    // public int compareTo(Produto produto) {
    //     if (this.getValor() > produto.getValor()){
    //         return 1;
    //     } else if (this.getValor() < produto.getValor()){
    //         return -1;
    //     } else {
    //         return 0;
    //     }
    // }

    // Forma mais elegante de comparar valores double
    @Override
    public int compareTo(Produto produto) {
        return Double.valueOf(this.getValor()).compareTo(Double.valueOf(produto.getValor()));
    }
}
