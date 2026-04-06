import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        int total = 0;

        do {
            System.out.println("\n--- Restaurant Menu ---");
            System.out.println("1. Burger - Rs.120");
            System.out.println("2. Pizza - Rs.250");
            System.out.println("3. Sandwich - Rs.100");
            System.out.println("4. Coffee - Rs.80");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    total = total + 120;
                    System.out.println("Burger added to order");
                    break;

                case 2:
                    total = total + 250;
                    System.out.println("Pizza added to order");
                    break;

                case 3:
                    total = total + 100;
                    System.out.println("Sandwich added to order");
                    break;

                case 4:
                    total = total + 80;
                    System.out.println("Coffee added to order");
                    break;

                case 5:
                    System.out.println("Order finished");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);

        System.out.println("Total Bill = Rs." + total);

        sc.close();
    }
}