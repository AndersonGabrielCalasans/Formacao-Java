public class Main {

    public static void main(String[] args) {

        String filme = "Top Gun: Maverick";
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: " + filme);

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        //Média da nota
        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun: Maverich
                Filme de aventura com galã dos anos 80
                """;
        System.out.println(sinopse);

        //Exemplo format
        String sinopseFormat = """
                Filme: %s
                Ano de lançamento: %d
                Nota: %f
                """.formatted(filme, anoDeLancamento, notaDoFilme);
        System.out.println(sinopseFormat);

        //Conversão de tipo (casting)
        int classificacao = (int) media/2;
        System.out.println(classificacao);


    }

}