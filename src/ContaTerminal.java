import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo ao sistema do banco, vamos iniciar o processo de identificação.");
        System.out.println("Digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite o nome da sua agência:");
        String agenciaBanco = scanner.next();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da sua conta:");
        double saldoConta = scanner.nextDouble();

        System.out.println(("Olá, "+nomeCliente+", obrigado por criar uma conta " +
                "em nosso banco, sua agência é "+agenciaBanco+",conta "+numeroConta+" e seu saldo "+saldoConta+
                " já está disponível para saque."));
    }
}