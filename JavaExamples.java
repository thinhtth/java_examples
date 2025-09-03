import java.util.Scanner;
import java.math.BigInteger;

public class JavaExamples {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("=====MENU=====");
                System.out.println("0.Exit");
                System.out.println("1.Add Two Numbers");
                System.out.println("2.Check Even or Add Number");
                System.out.println("3.Print Pattem");
                System.out.println("4.Add Two Binary Numbers");
                System.out.println("5.Add Two Complex Numbers");
                System.out.print("please choose what you want:");
                int choice = readInt(sc);

                switch (choice) {
                    case 0:
                        System.out.println("Goodbye");
                        return;
                    case 1: // Add Two Numbers
                        System.out.print("Enter the first numbert: ");
                        int a = readInt(sc);
                        System.out.print("Enter the second number: ");
                        int b = readInt(sc);
                        int sum = a + b;
                        System.out.println("Total = " + sum + "\n");
                        break;

                    case 2: {// Check Even or Odd Number
                        System.out.print("Enter an integer to check even/odd:");
                        int n = readInt(sc);
                        if (n % 2 == 0) {
                            System.out.print(n + " Is even.\n");
                        } else {
                            System.out.print(n + " Is Old.\n");
                        }
                        break;

                    }
                    case 3: {// Print Pattem
                        System.out.print("Enter the number of lines you want to print:");
                        int rows = readInt(sc);
                        for (int i = 1; i <= rows; i++) {
                            for (int j = 1; j <= i; j++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 4: {// Add Two Binary Numbers 
                        System.out.print("Enter the first binary number: ");
                        String b1 = sc.next();
                        System.out.print("Enter the second binary number: ");
                        String b2 = sc.next();

                        BigInteger bin1 = new BigInteger(b1, 2);
                        BigInteger bin2 = new BigInteger(b2, 2);

                        BigInteger Sum = bin1.add(bin2);
                        System.out.println("Result (binary): " + Sum.toString(2));
                        break;
                         }
                    case 5:{// Add Two Complex Numbers 
                        System.out.print("Enter real part of first complex number: ");
                        double r1 = sc.nextDouble();
                        System.out.print("Enter imaginary part of first complex number: ");
                        double i1 = sc.nextDouble();    
                        
                        System.out.print("Enter real part of second complex number: ");
                        double r2 = sc.nextDouble();
                        System.out.print("Enter imaginary part of second complex number: ");
                        double i2 = sc.nextDouble();
                    
                        double realSum = r1 + r2;
                        double imagSum = i1 + i2;
                        
                        System.out.print("Result: (" + realSum + ") + (" + imagSum +")i");
                        break;
                    }
                        

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
