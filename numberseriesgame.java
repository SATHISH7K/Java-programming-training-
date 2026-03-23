    import java.util.Scanner;
public class numberseriesgame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example sequence: 2, 4, 6, 8, ?
        System.out.println("Find the next number in series:");
        System.out.println("2 4 6 8 ?");

        int answer = sc.nextInt();

        if (answer == 10) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Correct answer is 10");
        }
    }
}
