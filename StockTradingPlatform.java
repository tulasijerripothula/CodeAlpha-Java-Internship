import java.util.*;

public class StockTradingPlatform {

    static double balance = 10000;
    static HashMap<String, Integer> portfolio = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1. Buy Stock");
            System.out.println("2. Sell Stock");
            System.out.println("3. View Portfolio");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Stock name: ");
                String stock = sc.next();

                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                System.out.print("Price per stock: ");
                double price = sc.nextDouble();

                double cost = qty * price;

                if (cost <= balance) {
                    balance -= cost;
                    portfolio.put(stock, portfolio.getOrDefault(stock, 0) + qty);
                    System.out.println("Stock purchased successfully!");
                } else {
                    System.out.println("Not enough balance!");
                }

            }

            else if (choice == 2) {

                System.out.print("Stock name: ");
                String stock = sc.next();

                System.out.print("Quantity: ");
                int qty = sc.nextInt();

                System.out.print("Price per stock: ");
                double price = sc.nextDouble();

                if (portfolio.containsKey(stock) && portfolio.get(stock) >= qty) {

                    balance += qty * price;
                    portfolio.put(stock, portfolio.get(stock) - qty);

                    System.out.println("Stock sold successfully!");

                } else {
                    System.out.println("You don't have enough stocks!");
                }

            }

            else if (choice == 3) {

                System.out.println("Portfolio: " + portfolio);
                System.out.println("Balance: " + balance);

            }

            else if (choice == 4) {
                break;
            }

        }

        sc.close();
    }
}