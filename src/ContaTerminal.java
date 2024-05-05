import java.util.Scanner;

public class ContaTerminal {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        int accountNumber = (args.length > 0) ? Integer.parseInt(args[0]) : 0;
        String bankBranch = (args.length > 0) ? args[1] : "";
        String clientFullName = (args.length > 0) ? args[2] : "";
        Float clientAccountBalance = (args.length > 0) ? Float.parseFloat(args[3]) : 0;

        System.out.println("Boas vindas à Agencia DIO");

        if(args.length > 0) {
            System.out.print("Deseja preencher os dados ou usar do terminal[T/P]? ");
            String option = scanner.nextLine();

            if(option.equalsIgnoreCase("T")) {
                welcome(accountNumber, bankBranch, clientFullName, clientAccountBalance);
                return;
            }
        }
            
        System.out.println("Preencha abaixo os dados as informações necessárias");

        System.out.print("Número da agência: ");
        accountNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Nome da agência bancária: ");
        bankBranch = scanner.nextLine();

        System.out.print("Nome completo do usuário: ");
        clientFullName = scanner.nextLine();

        System.out.print("Saldo do cliente: ");
        clientAccountBalance = Float.parseFloat(scanner.nextLine());

        welcome(accountNumber, bankBranch, clientFullName, clientAccountBalance);
    }

    private static void welcome(
        int accountNumber,
        String bankBranch,
        String clientFullName,
        Float clientAccountBalance
    ) {

        String account = String.valueOf(accountNumber);
        String balance = String.valueOf(clientAccountBalance);

        System.out.println("olá ".concat(clientFullName).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(bankBranch).concat(", conta ").concat(account).concat(" e seu saldo ").concat(balance).concat(" já está disponível para saque"));
    }
}
