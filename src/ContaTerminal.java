import java.util.Scanner;

public class ContaTerminal {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Por favor, digite o número da Conta!");
        conta.setNumero(input.nextInt());
        input.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        conta.setAgencia(input.nextLine());
        System.out.println("Por favor, digite o nome do Cliente!");
        conta.setNomeCliente(input.nextLine().toUpperCase());
        System.out.println("Por favor, digite o saldo da Conta!");
        conta.setSaldo(input.nextDouble());

        System.out.println("Óla "+conta.getNomeCliente()+", obrigado por criar uma conta em nosso banco, sua agência é "+conta.getAgencia()+", conta "+conta.getNumero()+" e seus saldo "+conta.getSaldo()+" já está disponíveil para saque.");
    }
}


