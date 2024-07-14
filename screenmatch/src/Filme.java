public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDeAvaliacoes;
    int duracaoEmMinutos;
    int totalDeAvaliacoes = 0;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
    }

    void avalia(double nota) {
        this.somaDeAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return this.somaDeAvaliacoes/this.totalDeAvaliacoes;
    }

}