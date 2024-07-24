package br.com.bb.zexercicios.principal;

import java.util.Scanner;

import com.google.gson.Gson;

import br.com.bb.zexercicios.modelo.Pessoa;

record Editora(String nome, String cidade) {
}

record Livro(String titulo, String autor, Editora editora) {
}

public class PrincipalRecordsGson {
    public static void main(String[] args) {

        Gson gson = new Gson();

        String json = """
                {
                "nome": "Gabriel",
                "idade": 29,
                "cidade": "Recife",
                "estado": "Pernambuco"
                }
                """;

        Pessoa pessoa = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoa);

        String jsonLivro = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";
        Livro livro = gson.fromJson(jsonLivro, Livro.class);
        System.out.println("Objeto Livro: " + livro);
        Scanner scan = new Scanner(System.in);
        String nome = scan.nextLine();
        System.out.println(nome);
        scan.close();
    }
}
