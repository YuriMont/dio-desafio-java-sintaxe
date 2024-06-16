import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da conta! ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = scan.next();

        scan.nextLine();

        System.out.println("Por favor, digite seu nome! ");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o seu saldo! ");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}