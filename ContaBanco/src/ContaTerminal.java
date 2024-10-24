import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação do Scanner para entrada de dados via terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.next(); // Usa next() para evitar problemas com espaços

        scanner.nextLine(); // Limpa o buffer do scanner após next()

        System.out.print("Por favor, digite seu Nome: ");
        String nomeCliente = scanner.nextLine(); // nextLine() para pegar nomes completos

        System.out.print("Por favor, digite o Saldo: ");
        double saldo = scanner.nextDouble();

        // Exibindo a mensagem final com concatenação de Strings
        String mensagem = "Olá " + nomeCliente + 
                          ", obrigado por criar uma conta em nosso banco, sua agência é " + 
                          agencia +", a conta é " + numero + 
                          " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechando o Scanner para evitar vazamento de recursos
        scanner.close();
    }
}
