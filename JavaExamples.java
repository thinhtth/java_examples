import java.util.Scanner;
import java.sql.Date;
import java.time.Instant;
import java.util.ArrayList;

public class JavaExamples {
    private static final String filePath = "user-actions.txt";
    private static final ArrayList<String> actions = new ArrayList<String>();
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                String content = FileService.read(filePath);
                System.out.println(content);
                
                System.out.println("=====MENU=====");
                System.out.println("0.Exit");
                System.out.println("1.Add Two Numbers");
                System.out.println("2.Check Even or Add Number");
                System.out.println("3.Print Pattem");
                System.out.println("4.Add Two Binary Numbers");
                System.out.println("5.Add Two Complex Numbers");
                System.out.println("6.multiply Two Numbers");
                System.out.println("7.Check Leap Year");

                int choice = readInt(sc, "please choose what you want:");

                switch (choice) {
                    case 0:
                        System.out.println("Goodbye");
                        actions.forEach(System.out::println);
                        FileService.append(filePath, System.lineSeparator() + String.join(System.lineSeparator(), actions));
                        return;
                    case 1: // Add Two Numbers
                        int a = readInt(sc, "Enter the first numbert: ");
                        int b = readInt(sc, "Enter the second number: ");
                        System.out.println("Total = " + (a + b) + "\n");
                        storeUserAction("Added " + a + " and " + b + " to get " + (a + b));
                        break;
                    case 2: {// Check Even or Odd Number
                        int n = readInt(sc, "Enter an integer to check even/odd:");
                        boolean isEven = (n % 2 == 0);
                        if (isEven) {
                            System.out.print(n + " Is even.\n");
                        } else {
                            System.out.print(n + " Is Old.\n");
                        }
                        storeUserAction("Checked " + n + " is " + (isEven ? "even" : "odd"));
                        break;
                    }
                    case 3: {// Print Pattem
                        int rows = readInt(sc, "Enter the number of lines you want to print:");
                        for (int i = 1; i <= rows; i++) {
                            for (int j = 1; j <= i; j++){
                                System.out.print("* ");
                            }
                            System.out.println();
                        }
                        storeUserAction("Printed a pattern with " + rows + " rows");
                        break;
                    }
                    case 4: {// Add Two Binary Numbers 
                        int bin1 = readBinaryNumber(sc, "Enter the first binary number: ");
                        int bin2 = readBinaryNumber(sc, "Enter the second binary number: ");
                        int sum = bin1 + bin2;
                        System.out.println("Result (binary): " + Integer.toBinaryString(sum));
                        break;
                    }
                    case 5:{// Add Two Complex Numbers // ràng buộc bắt nhập đúng số 
                        System.out.print("Enter first complex number (real imaginary): ");
                        double r1 = readDouble(sc, "real part: ");
                        double i1 = readDouble(sc, "imaginary part: ");
                                               
                        System.out.print("Enter second complex number (real imaginary): ");
                        double r2 = readDouble(sc, "real part: ");
                        double i2 = readDouble(sc, "imaginary part: ");

                        double realSum = r1 + r2;
                        double imagSum = i1 + i2;
                        System.out.println("Result: (" + realSum + ") + (" + imagSum +")i");
                        storeUserAction("Added two complex numbers: (" + r1 + " + " + i1 + "i) and (" + r2 + " + " + i2 + "i) to get (" + realSum + " + " + imagSum + "i)");
                        break;
                    }
                    case 6:{ // Multiply Two Numbers 
                        int m1 = readInt(sc, "Enter the first numbers:");
                        int m2 = readInt(sc, "Enter the second numbers:");
                        int X  = m1 * m2;
                        System.out.println(" X = " + X + "\n " );
                        storeUserAction("Multiplied " + m1 + " and " + m2 + " to get " + X);
                        break;    
                    }    
                    case 7:{ // Check Leap Year // ràng buộc bắt nhập đúng số
                        System.out.print("Enter a year to check:");
                        int year = sc.nextInt();
                        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                        if (isLeapYear){
                            System.out.println(year + " is a leap year.");
                        }else {
                            System.out.println(year + " not a leap year.");
                        }
                        storeUserAction("Checked " + year + " is " + (isLeapYear ? "a leap year" : "not a leap year"));
                        break;
                    }
                    default:
                        System.out.println("This option is not available.Try again!\n");
                        break;
                }
            } while (true);

        }
    }

    private static int readInt(Scanner sc, String message) {
        System.out.println(message);
        while (!sc.hasNextInt()) {
            System.out.print("You have entered an incorrect number. Please enter an integer: ");
            sc.next(); 
        }
        return sc.nextInt();
    }
    
    private static int readBinaryNumber(Scanner sc, String message) {
        System.out.println(message);
        while (!sc.hasNext("[01]+")) {
            System.out.print("You have entered an incorrect number. Please enter an binary number: ");
            sc.next(); 
        }
        return Integer.parseInt(sc.next(), 2);
    }
    private static void storeUserAction(String message) {
        actions.add(Instant.now().toString() + " - " + message);
    }

    private static double readDouble(Scanner sc, String message) {
        System.out.println(message);
        while (!sc.hasNextDouble()) {
            System.out.print("You have entered an incorrect number. Please enter a decimal number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}