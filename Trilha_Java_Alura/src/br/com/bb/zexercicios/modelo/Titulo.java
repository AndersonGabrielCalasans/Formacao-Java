package br.com.bb.zexercicios.modelo;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Cria a comparação para ordenação pelo atributo (String) nome
    @Override
    public int compareTo(Titulo titulo) {
        return this.getNome().compareTo(titulo.getNome());
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
