import java.util.Scanner;

public class ContaCorrente {
    public static void main(String[] args) {

        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da conta: ");
        int cc = sc.nextInt();
        System.out.println("Digite o número da agência: ");
        String ag = sc.next();
        System.out.println("Digite o nome do cliente: ");
        String nome = sc.next();
        System.out.println("Insira o valor de saldo");
        double saldo = sc.nextDouble();

        //Obter pela scanner os valores digitados no terminal


        //Exibir mensagem de conta criada
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, " +
                "su agência é: " + ag + ", conta: " + cc + " e seu saldo: " + saldo +
                " já está disponivel para saque");
    }
}
