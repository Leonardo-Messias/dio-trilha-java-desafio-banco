import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        cliente.agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        cliente.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        cliente.nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        cliente.saldo = scanner.nextFloat();

        System.out.println("Olá " + cliente.nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + cliente.agencia
                + ", conta " + cliente.numero + " e seu saldo R$" + cliente.saldo + " já está disponível para saque.");

        scanner.close();

    }
}
