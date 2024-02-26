import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 100.30;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta:");
        numeroConta = scanner.nextInt();

        // Consumir a nova linha em branco no buffer
        scanner.nextLine();

        System.out.println("Informe a agência da conta:");
        agencia = scanner.nextLine();

        System.out.println("Informe o seu nome completo:");
        nomeCliente = scanner.nextLine();

        scanner.close();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta no nosso banco. Sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}

