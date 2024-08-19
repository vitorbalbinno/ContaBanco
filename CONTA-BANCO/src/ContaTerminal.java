import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();


        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f",
        nomeCliente, agencia, numero, saldo);

        System.out.println(mensagem);
    }
}