import java.util.Scanner;

public class JavaExamples {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("=====MENU=====");
                System.out.println("0. Exit");
                System.out.println("1. Add Two Numbers");
                System.out.println("2. Check Even or Add Number");
                System.out.println("3. Print Pattern");
                System.out.println("Please choose what you want:");
                int choice = readInt(sc);

                switch (choice) {
                    case 0:
                        System.out.println("Goodbye");
                        return;
                        
                    case 1: // Add Two Numbers
                        System.out.println("Enter the first numbert: ");
                        int a = readInt(sc);
                        System.out.println("Enter the second number: ");
                        int b = readInt(sc);
                        int sum = a + b;
                        System.out.println("Total = " + sum + "\n");
                        break;

                    case 2: // Check Even or Odd Number
                        System.out.println("Enter an integer to check even/odd:");
                        int n = readInt(sc);
                        if (n % 2 == 0) {
                            System.out.println(n + " Is even.\n");
                        } else {
                            System.out.println(n + " Is Old.\n");
                        }
                        break;

                    case 3: // Print Pattern
                        System.out.println("Enter the number of lines you want to print:");
                        int rows = readInt(sc);
                        for (int i = 1; i <= rows; i++) {
                            for (int j = 1; j <= i; j++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;

                    default:
                        System.out.println("This option is not available.Try again!\n");
                        break;
                }

            } while (true);
        }
    }


    private static int readInt(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.print("You have entered an incorrect number. Please enter an integer: ");
            sc.next(); 
        }
        return sc.nextInt();
    }
}
