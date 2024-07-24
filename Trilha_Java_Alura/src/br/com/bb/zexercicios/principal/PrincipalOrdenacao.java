package br.com.bb.zexercicios.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.bb.zexercicios.modelo.Titulo;

public class PrincipalOrdenacao {
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5,2,3,1));
        // List<Integer> numeros = new LinkedList<>(Arrays.asList(5,2,3,1));
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);
        

        Titulo t1 = new Titulo("Titulo 3");
        Titulo t2 = new Titulo("Titulo 1");
        Titulo t3 = new Titulo("Titulo 2");

        List<Titulo> listaTitulos = new ArrayList<>(Arrays.asList(t1,t2,t3));        
        System.out.println(listaTitulos);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

        // Polimorfia em listas
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
