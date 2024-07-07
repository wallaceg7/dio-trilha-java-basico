
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Definir o Locale para o programa como americano
        Locale.setDefault(Locale.US);

        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        int numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Usuário: "+numero+" (depois ENTER para o próximo campo)");
        teclado.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        String agencia = teclado.next();
        teclado.nextLine();
        System.out.println("Agência: "+agencia+" (depois ENTER para o próximo campo)");
        teclado.nextLine();

        System.out.print("Por favor, digite o Nome do Cliente: ");
        String nome = teclado.next().toUpperCase();
        teclado.nextLine();
        System.out.println("Nome: "+nome+" (depois ENTER para o próximo campo)");
        teclado.nextLine();

        System.out.print("Por favor, informe o Saldo: ");
        double saldo = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Saldo: "+saldo+" (depois ENTER para o próximo campo)");
        teclado.nextLine();
        teclado.close();
        
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.\n");

    }
}
