package br.com.bb.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.bb.screenmatch.modelos.*;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Cria a solicitação do filme
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();

        // Cria endereço customizado de busca
        String endereco = "https://www.omdbapi/?t=" + busca + "&apikey=75cc07dd";

        // ! Padrão para criação de uma requisição HTTP
        // ? Verificar javadoc Class HttpRequest
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();

        // ! Obter um response (resposta) da requisição
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        // Exibir o response body e salvar em uma String json
        String json = response.body();
        System.out.println(json);

        // Cria um objeto que manipula arquivos json
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        // Converte String json em um objeto do record TituloOmdb
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);

        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println(meuTitulo);

        leitura.close();
    }
}
