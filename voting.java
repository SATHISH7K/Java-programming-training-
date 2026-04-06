import java.util.Scanner;

public class voting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] candidates = {"Alice", "Bob", "Charlie"};
        int[] votes = {0, 0, 0};

        int choice;

        do {
            System.out.println("\n===== Online Voting System =====");
            System.out.println("1. Display Candidates");
            System.out.println("2. Vote for Candidate");
            System.out.println("3. Show Winner");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            if (choice == 1) {

                System.out.println("\nCandidates List:");
                for (int i = 0; i < candidates.length; i++) {
                    System.out.println((i + 1) + ". " + candidates[i]);
                }

            } 
            else if (choice == 2) {

                System.out.print("Enter candidate number to vote: ");
                int vote = sc.nextInt();

                if (vote >= 1 && vote <= candidates.length) {
                    votes[vote - 1]++;
                    System.out.println("Vote recorded successfully!");
                } 
                else {
                    System.out.println("Invalid candidate number!");
                }

            } 
            else if (choice == 3) {

                int maxVotes = votes[0];
                int winnerIndex = 0;

                for (int i = 1; i < votes.length; i++) {
                    if (votes[i] > maxVotes) {
                        maxVotes = votes[i];
                        winnerIndex = i;
                    }
                }

                System.out.println("Winner is: " + candidates[winnerIndex]);
                System.out.println("Total Votes: " + maxVotes);

            }

        } while (choice != 4);

        System.out.println("Voting ended.");
    }
}