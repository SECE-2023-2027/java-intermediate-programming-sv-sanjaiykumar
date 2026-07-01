import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter account number: ");
            String accountNumber = scanner.nextLine();

            System.out.print("Enter account holder name: ");
            String accountHolderName = scanner.nextLine();

            System.out.print("Enter opening balance: ");
            double balance = scanner.nextDouble();

            BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

            System.out.print("Enter deposit amount: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter withdrawal amount: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);

            System.out.println("Current balance: " + account.getBalance());
            System.out.println("Account details: " + account);
        }
    }
}
