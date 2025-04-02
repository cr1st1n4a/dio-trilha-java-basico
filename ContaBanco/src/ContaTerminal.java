import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TO DO: COnhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Exibir as mensagens para o nosso usuario
        System.out.println("Por favor, digite o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, deposite um valor na conta:");
        double saldo = scanner.nextDouble();
        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
