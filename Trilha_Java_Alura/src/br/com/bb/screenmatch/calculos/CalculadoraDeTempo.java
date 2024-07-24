package br.com.bb.screenmatch.calculos;

// import br.com.bb.screenmatch.modelos.Filme;
// import br.com.bb.screenmatch.modelos.Serie;
import br.com.bb.screenmatch.modelos.*;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

    // public void inclui(Filme filme) {
    //     this.tempoTotal += filme.getDuracaoEmMinutos();
    // }

    // public void inclui(Serie serie) {
    //     this.tempoTotal += serie.getDuracaoEmMinutos();
    // }
}
