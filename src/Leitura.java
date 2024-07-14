import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = teclado.nextLine();

        System.out.println("Qual ano de lançamento: ");
        int anoDeLancamento = teclado.nextInt();

        System.out.println("Digite sua nota para o filme: ");
        double avaliacao = teclado.nextDouble();

        System.out.println("Filme: " + filme);
        System.out.println("Ano do lançamento: " + anoDeLancamento);
        System.out.println("Nota: " + avaliacao);
    }
}
