package br.com.bb.zexercicios.compras.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.bb.zexercicios.compras.modelo.Produto;

public class PrincipalCompras {

    // Variáveis estáticas
    static double limiteCartao = 0.0;
    static List<Produto> listaDeCompras;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Digite o limite do cartão: ");
        limiteCartao = input.nextDouble();
        listaDeCompras = new ArrayList<Produto>();
        menuDeCompras();
    }

    public static void menuDeCompras() {
        System.out.println("""
                
                1- Comprar produto
                0- Sair
                    """);
        int opcao = input.nextInt();

        switch (opcao) {
        case 1:
            cadastraProduto();
            break;
        case 0:
            retornaCompras();
            System.exit(0);
            break;

        default:
            System.out.println("\nOpção Inválida!\n");
            menuDeCompras();
            break;
        }
    }

    public static void cadastraProduto() {
        System.out.println("\nDigite o nome do produto: ");
        String nome = input.next();
        System.out.println("\nDigite o valor: ");
        double valor = input.nextDouble();

        if (valor < limiteCartao) {
            var produto = new Produto(nome, valor);
            listaDeCompras.add(produto);
            limiteCartao -= produto.getValor();
            System.out.println("\nCompra realizada!\n");
            menuDeCompras();
        } else {
            System.out.println("\nSaldo insuficiente!\n");
            retornaCompras();
        }
    }

    public static void retornaCompras() {
        System.out.println("""
                *************************************
                COMPRAS REALIZADAS:""");
        Collections.sort(listaDeCompras);
        for (Produto produto : listaDeCompras) {
            System.out.printf("\n%s - %.2f", produto.getDescricao(), produto.getValor());
        }
        System.out.printf("""


                *************************************
                \nSALDO NO CARTÃO R$: %.2f

                """, limiteCartao);
    }
}
