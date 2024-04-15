import java.util.Scanner;

public class Conta {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int limite = 100;
        System.out.println("Digite sua agencia bancaria ");
        String agencia = scanner.next();

        System.out.println("Digite o numero da conta ");
        String numeroConta = scanner.next();

        System.out.println("Digite uma opção: 1 - Sacar, 2 - Depositar ");        
        int operacao = scanner.nextInt();

        System.out.println("Digite o valor: ");        
        int valor = scanner.nextInt();

        if (operacao < 2) limite -= valor;
        else limite += valor; 

        System.out.println(String.format("Seu saldo é %d ",limite));   

        scanner.close();
    }
}