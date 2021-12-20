import java.util.Scanner;

public class JobiiAccount {

    int saldo;
    int historicoAnterior;
    String nome;
    String id;
    String senha;

    JobiiAccount(String cname, String cid, String cpassword) {
        nome = cname;
        id = cid;
        senha = cpassword;
    }

    void deposito(int saldoTotal) {

        if (saldoTotal != 0) {
            saldo += saldoTotal;
            historicoAnterior = saldoTotal;
        }
    }

    void saque(int saldoTotal) {

        if (saldoTotal != 0) {
            saldo = saldo - saldoTotal;
            historicoAnterior = -saldoTotal;
        }
    }

    void getPrevious() {
        if (historicoAnterior > 0) {
            System.out.println("Depósito: " + historicoAnterior);
        } else if (historicoAnterior < 0) {
            System.out.println("Saque: " + Math.abs(historicoAnterior));
        } else {
            System.out.println("Nenhuma transação foi realizada");
        }
    }

    void showMenu() {
        char option ;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = sc.next();
        System.out.println("Digite seu ID: ");
        id = sc.next();
        System.out.println("Digite sua senha: ");
        senha = sc.next();

        System.out.println("Bem-vindo " + nome);
        System.out.println("Seu ID é " + id);
        System.out.println("\n");
        System.out.println("A. Verifique o saldo");
        System.out.println("B. Depósito");
        System.out.println("C. Saque");
        System.out.println("D. Transação anterior");
        System.out.println("E. Sair");

        do {
            System.out.println("==========================================================================");
            System.out.println("Escolha a opção: ");
            System.out.println("==========================================================================");
            option = sc.next().charAt(0);
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Saldo = " + saldo);
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'B':
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Qual valor deseja depositar : ");
                    System.out.println("------------------------------------------------------------------------");
                    int saldoTotal = sc.nextInt();
                    deposito(saldoTotal);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("------------------------------------------------------------------------");
                    int saldoTotal2 = sc.nextInt();
                    saque(saldoTotal2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println();
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*************************************************************************");
                    break;

                default:
                    System.out.println("Opção inválida! Porfavor tente novamente.");
                    break;
            }
        } while (option != 'E');
        System.out.println("Obrigado por utilizar nossos serviços!");

    }

}
