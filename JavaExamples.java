import java.util.Scanner;

public class JavaExamples {
   
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("=====MENU=====");
                System.out.println("0.Exit");
                System.out.println("1.Add Two Numbers");
                System.out.println("2.Check Even or Add Number");
                System.out.print("please choose what you want:");
                int choice = sc.nextInt();

                switch (choice) {
                    case 0:
                        System.out.println("Goodbye");
                        return;
                    case 1: // Add Two Numbers
                        System.out.print("Enter the first numbert: ");
                        int a = sc.nextInt();
                        System.out.print("Enter the second number: ");
                        int b = sc.nextInt();
                        int sum = a + b;
                        System.out.println("Total = " + sum + "\n");
                        break;
                

                     case 2:{//Check Even or Odd Number 
                        System.out.print("Enter an integer to check even/odd:");
                        int n = sc.nextInt();
                        if (n % 2 == 0) {
                            System.out.print(n + "Is even.\n");
                        } else {
                            System.out.print(n + "Is Old.\n");
                        }
                        break;                    
                            
                    }
                    default:
                       System.out.println("This option is not available.Try again!\n");
                       break;
                }

            }  while (true);
        }
    }
}

                        
                        
                           

