package br.com.bb.zexercicios.modelo;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public void converterDolarEmReal(double valor) {
        double cotacaoDolar = 5.5;
        double valorEmReal = valor * cotacaoDolar;
        System.out.printf("Valor em reais R$: %.2f", valorEmReal);
    }

}
