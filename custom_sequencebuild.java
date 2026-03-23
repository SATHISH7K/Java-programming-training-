import java.util.Scanner;

public class custom_sequencebuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
do{
    System.err.println("----------->");
        System.out.println("1. Even Numbers");
        System.out.println("2. Odd Numbers");
        System.out.println("3. Fibonacci");
        System.out.print("Choose option: ");

         choice = sc.nextInt();
        if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
        System.out.print("Enter limit: ");
        int n = sc.nextInt();
            switch (choice) {
            case 1:
                for (int i = 2; i <= n; i += 2)
                    System.out.print(i + " ");
                System.out.println();
                break;

            case 2:
                for (int i = 1; i <= n; i += 2)
                    System.out.print(i + " ");
                System.out.println();
                break;

            case 3:
                int a = 0, b = 1;
                for (int i = 1; i <= n; i++) {
                    System.out.print(a + " ");
                    int c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println();
                break;

            default:
                System.out.println("Invalid choice");
        }
    }while(choice!=4);
    sc.close();
}
}