package ContaBanco.src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        Conta c = new Conta();
        while (opcao != 5) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Mostrar dados do cliente");
            System.out.println("5 - Sair");
            System.out.print("> ");

            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                System.out.print("Digite o número da conta: ");
                int numero = ler.nextInt();
                System.out.print("Digite o nome do titular: ");
                String titular = ler.next();
                System.out.print("Deseja depositar um valor inicial? (s/n) ");
                String resposta = ler.next();
        
                double saldo = 0.0;
                if (resposta.equalsIgnoreCase("s")) {
                    System.out.print("Digite o valor do depósito: ");
                    saldo = ler.nextDouble();
                    c.setNumero(numero);
                    c.setTitular(titular);
                   c.setSaldo(saldo);
                }
                System.out.println("Cadatrado com sucesso");
                    break;
                case 2:
                    System.out.println("Digote o valor para deposito");
                    double v = ler.nextDouble();
                    c.depositar(v);
                    break;
                case 3:
                    System.out.println("Digote o valor para saque");
                    double v1 = ler.nextDouble();
                    boolean a = c.sacar(v1);
                    if (a == true) {
                        System.out.println("Saque realizado com sucesso");
                    } else {
                        System.out.println("Saque não realizado, devido saldo de somente" + c.getSaldo());
                    }
                    break;
                case 4:
                    c.exibirDados();
                    break;
                case 5:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Operação inválida. Tente novamente.");
                    break;
            }
        }
    
       ler.close();
    }
}
