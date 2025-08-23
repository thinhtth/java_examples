import java.util.Scanner;

public class JavaExamples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("=====MENU=====");
            System.out.println("0.EXIT");
            System.out.println("1.Add Two Numbers");
            System.out.print("please choose what you want:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the first numbert: ");
                    int a = sc.nextInt();
                    System.out.print("Enter the second number: ");
                    int b = sc.nextInt();
                    int sum = a + b;
                    System.out.println("Total = " + sum);
                    break;

                default:
                    break;
            }

        } while (true);
    }
}
