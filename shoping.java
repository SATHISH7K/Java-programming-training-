import java.util.Scanner;
public class shoping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = {"Pen", "Notebook", "Bag", "Pencil"};
        int[] prices = {10, 50, 300, 5};

        int total = 0;
        int choice;

        do {
            System.out.println("\n===== Shopping Cart System =====");
            System.out.println("1. Display Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Calculate Total Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Products:");
                    for (int i = 0; i < products.length; i++) {
                        System.out.println((i + 1) + ". " + products[i] + " - Rs." + prices[i]);
                    }
                    break;

                case 2:
                    System.out.print("Enter product number to add to cart: ");
                    int productNumber = sc.nextInt();

                    if (productNumber >= 1 && productNumber <= products.length) {
                        total = total + prices[productNumber - 1];
                        System.out.println(products[productNumber - 1] + " added to cart.");
                    } else {
                        System.out.println("Invalid product number!");
                    }
                    break;

                case 3:
                    System.out.println("Total Bill Amount = Rs." + total);
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}