import java.util.Scanner;
public class hospital {
    static String[] patientNames = new String[50];
    static int[] patientAges = new int[50];
    static String[] diseases = new String[50];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);
    public static void addPatient() {
        System.out.print("Enter Patient Name: ");
        patientNames[count] = sc.nextLine()
        System.out.print("Enter Patient Age: ");
        patientAges[count] = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        diseases[count] = sc.nextLine();
        count++;
        System.out.println("Patient Added Successfully!");
    }
    public static void viewPatients() {
        if (count == 0) {
            System.out.println("No patient records found.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println("Patient ID: " + i);
                System.out.println("Name: " + patientNames[i]);
                System.out.println("Age: " + patientAges[i]);
                System.out.println("Disease: " + diseases[i]);
                System.out.println("---------------------");
            }
        }
    }
    public static void searchPatient() {
        System.out.print("Enter patient name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (patientNames[i].equalsIgnoreCase(name)) {
                System.out.println("Patient Found!");
                System.out.println("Name: " + patientNames[i]);
                System.out.println("Age: " + patientAges[i]);
                System.out.println("Disease: " + diseases[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Patient not found.");
        }
    }
    public static void deletePatient() {
        System.out.print("Enter patient name to delete: ");
        String name = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if (patientNames[i].equalsIgnoreCase(name)) {
                for (int j = i; j < count - 1; j++) {
                    patientNames[j] = patientNames[j + 1];
                    patientAges[j] = patientAges[j + 1];
                    diseases[j] = diseases[j + 1];
                }
                count--;
                System.out.println("Patient record deleted.");
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- Hospital Management System ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                addPatient();
            } else if (choice == 2) {
                viewPatients();
            } else if (choice == 3) {
                searchPatient();
            } else if (choice == 4) {
                deletePatient();
            } else if (choice == 5) {
                System.out.println("Exiting program...");
            } else {
                System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}