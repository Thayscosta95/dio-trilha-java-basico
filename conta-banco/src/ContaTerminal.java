import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " , Obrigado por criar uma conta em nosso banco, sua Agencia é "
         + agencia + ", conta " + numero + " e seu Saldo" + "já está disponvel para saque.");

        scanner.close();

       //todo: conhecer e importar a classe scanner 
       //
       // exibir as mensagens para nosso usuario
       //obter pela classe scaner os valores digitados no terminal 
       //exibir a mensagem final, a mensagem da conta criada 
    }
}
