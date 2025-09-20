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
                System.out.println("6.multiply Two Numbers");
                System.out.println("7.Check Leap Year");
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
                        System.out.println("Total = " + (a + readInt(sc)) + "\n");
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
                        BigInteger bin1 = new BigInteger(sc.next(), 2);
                        
                        System.out.print("Enter the second binary number: ");
                        BigInteger bin2 = new BigInteger(sc.next(), 2);  

                        BigInteger sum = bin1.add(bin2);
                        System.out.println("Result (binary): " + sum.toString(2));
                        break; // cần thêm phần giúp user cần nhập nhị phân
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
                    case 6:{ // Multiply Two Numbers 
                        System.out.print("Enter the first numbers:");
                        int m1 = readInt(sc);
                        System.out.print("Enter the second numbers:");
                        int m2 = readInt(sc);
                        int X  = m1 * m2;
                        System.out.println(" X = " + X + "\n " );
                        break;    
                    }    
                    case 7:{ // Check Leap Year 
                        System.out.print("Enter a year to check:");
                        int year = sc.nextInt();
                        boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
                        if (isLeapYear){
                            System.out.println(year + " is a leap year.");
                        }else {
                            System.out.println(year + " not a leap year.");
                        }
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
// rút gọn lại và coi lại phần case4