import java.util.Scanner;

public class ContaBancaria {

    static Scanner input = new Scanner(System.in);
    private static String nome = "Jacqueline Oliveira";
    private static String tipoConta = "Corrente";
    private static double saldo = 2500.00;

    public static void main(String[] args) {

        System.out.println("""
                ***********************
                Dados iniciais do cliente:
                                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ $f
                ***********************
                """.formatted(nome, tipoConta, saldo));

        operacoes();
    }

    public static void operacoes() {
        System.out.println("""
                Operações
                                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                                
                Digite a opção desejada: 
                """);
        int opcao = input.nextInt();

        switch (opcao) {
            case 1:
                consultaSaldo();
                break;
            case 2:
                recebeValor();
                break;
            case 3:
                transfereValor();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Operação Inválida!");
                operacoes();
                break;
        }
    }

    public static void consultaSaldo() {
        System.out.println("Saldo na conta: " + saldo);
        operacoes();
    }

    private static void recebeValor() {
        System.out.println("Digite o valor de depósito: ");
        saldo += input.nextDouble();
        System.out.println("Saldo atualizado R$: " + saldo);
        operacoes();
    }

    private static void transfereValor() {
        System.out.println("Digite o valor de transferencia: ");
        double valor = input.nextDouble();

        if (saldo < valor) {
            System.out.println("Saldo insuficiente!");
            operacoes();
        } else {
            saldo -= valor;
            System.out.println("Saldo atualizado R$: " + saldo);
            operacoes();
        }

    }
}
