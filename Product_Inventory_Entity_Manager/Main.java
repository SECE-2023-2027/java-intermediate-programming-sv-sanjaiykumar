import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        String productId = scanner.nextLine();

        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter stock quantity: ");
        int stockQuantity = scanner.nextInt();

        Product p = new Product(productId, productName, price, stockQuantity);

        System.out.print("\nEnter discount percentage to apply (0-100): ");
        double discountPercent = scanner.nextDouble();
        p.applyDiscount(discountPercent);
        
        System.out.println(p.getPrice());
        System.out.println(p.getStockQuantity());

        scanner.close();
    }
}
