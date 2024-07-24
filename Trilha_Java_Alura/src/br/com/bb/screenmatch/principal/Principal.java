package br.com.bb.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bb.screenmatch.calculos.CalculadoraDeTempo;
import br.com.bb.screenmatch.calculos.FiltroRecomendacao;
import br.com.bb.screenmatch.modelos.Episodio;
import br.com.bb.screenmatch.modelos.Filme;
import br.com.bb.screenmatch.modelos.Serie;
import br.com.bb.screenmatch.modelos.Titulo;

public class Principal {
	public static void main(String[] args) {
		Filme meuFilme = new Filme("O poderoso chefão", 1970);
		meuFilme.setDuracaoEmMinutos(180);

		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);
		System.out.println(
				"Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
		System.out.printf("Media de avaliações: %.2f\n\n",
				meuFilme.pegaMedia());

		Serie lost = new Serie("Lost", 1970);
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodios(50);
		lost.exibeFichaTecnica();
		System.out.println("Duração para maratonar lost: "
				+ lost.getDuracaoEmMinutos() + " minutos.");

		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.setDuracaoEmMinutos(200);

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(outroFilme);
		calculadora.inclui(meuFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());

		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);

		Episodio episodio = new Episodio(lost, "Episodio pitolo", 2023);
		episodio.setNumero(1);
		episodio.setTotalDeAvaliacoes(45);
		filtro.filtra(episodio);

		// Apartir do Java 10 é possível colocar var
		var primeiroFilme = new Filme("Dogville", 2003);
		primeiroFilme.setDuracaoEmMinutos(200);
		primeiroFilme.avalia(10);

		// ArrayList<Titulo> filmes = new ArrayList<>();
		// List<Titulo> filmes = new LinkedList<>();
		List<Titulo> filmes = new ArrayList<>();

		filmes.add(primeiroFilme);
		filmes.add(meuFilme);
		filmes.add(outroFilme);
		filmes.add(lost);

		// Retorna o toString do ArrayList
		// ! O método ToString foi reescrito na classe Filme
		System.out.println(filmes + "\n");
		// filmes.remove(filmes.size() - 1);
		System.out.println(filmes + "\n");

		/*
		 * 1- Retorna o tamanho do array 2- Retorna qual objeto na posição 1 3-
		 * Retira o objeto se tiver o getNome() igual ao informado 4- Reimprime
		 * o 1 e 2
		 */

		// System.out.println("Tamanho da lista: " + filmes.size());
		// System.out
		// 		.println("Primeiro filme da lista: " + filmes.get(1).getNome());
		// System.out.println("" + filmes.get(1).toString());
		// filmes.removeIf(titulo -> titulo.getNome().equals("O poderoso chefão"));
		// System.out.println("Tamanho da lista: " + filmes.size());
		// System.out
		// 		.println("Primeiro filme da lista: " + filmes.get(0).getNome());
		// System.out.println();

		// Percorre a lista de Titulos, printa o nome do titulo
		// Se o titulo for um filme (instanceof) e a classificação > 2 ele mostra a classificacao
		for (Titulo item : filmes) {
			System.out.println("Nome: " + item.getNome());
			if (item instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação: " + filme.getClassificacao());
			}
		}

		// Trabalhando com Ordenação de lista
		ArrayList<String> buscaPorDev = new ArrayList<>();
		buscaPorDev.add("Gabriel");
		buscaPorDev.add("Anderson");
		buscaPorDev.add("Isaias");
		System.out.println(buscaPorDev);

		// Ordenando lista de objetos comparáveis
		Collections.sort(buscaPorDev);
		System.out.println(buscaPorDev);

		// Ordenando listas de objetos comuns (precisa da implementação 
		// na classe da interface Comparable)
		System.out.println();
		System.out.println(filmes);

		// Ordenando Titulos pelo nome do título
		Collections.sort(filmes);
		System.out.println();
		System.out.println(filmes);
		
		// Ordenando os titulos pelo ano de lançamento
		// Ele cria procedência em cima do compareTo()
		filmes.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println(filmes);
	}
}
