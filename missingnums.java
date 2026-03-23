    import java.util.Scanner;
public class missingnums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (n-1): ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int total = (n + 1) * (n + 2) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Missing number = " + (total - sum));
    }
}

