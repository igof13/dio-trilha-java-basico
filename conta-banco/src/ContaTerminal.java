import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre seu nome.");
        String nome = scanner.nextLine();

        System.out.println("Entre sua Agência.");
        int numAgencia = scanner.nextInt();

        System.out.println("Entre seu número de conta bancária.");
        int numContaBancaria = scanner.nextInt();

        System.out.println("Entre seu saldo.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + numAgencia + ", conta " + numContaBancaria + " e seu saldo " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
