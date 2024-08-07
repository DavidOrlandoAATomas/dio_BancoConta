package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
       String nome_cliente;
       String Agencia;
       int numero;
       float saldo_conta;
       Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, introduza o numero de sua agência");
        Agencia = ler.nextLine();
        System.out.println("Por favor, introduza seu nome");
        nome_cliente = ler.nextLine();
        System.out.println("Por favor, introduza seu numero de conta");
        numero = ler.nextInt();
        System.out.println("Por favor, introduza seu saldo de conta");
        saldo_conta = ler.nextFloat();
        System.out.println("Olá, "+nome_cliente+", obrigado por criar uma conta no nosso banco, sua agência é "+Agencia+", conta "+numero+" e seu saldo "+saldo_conta+"kz está disponível para levantamento.");


    }

}
