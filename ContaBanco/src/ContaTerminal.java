import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o nosso usuário

        //Obeter pelo  scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        
        Scanner sc = new Scanner(System.in);
        int agencia;
        int numero;
        String nome;
        double saldo;

//Entrada de Dados
        System.out.println("Por favor digite seu nome !");
        nome = sc.next();

        System.out.println("Por favor, digite o Numero da Agência !");
        agencia = sc.nextInt();

        System.out.println("Por digite o numero da conta !");
        numero = sc.nextInt();

        System.out.println("Digite o valor do Deposíto");
        saldo = sc.nextDouble();

//Saida de Dados
        System.out.println("Ola " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
