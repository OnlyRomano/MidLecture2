import java.util.InputMismatchException;
import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int choice;

            do {
                System.out.println("1. MDAS of 2 Numbers");
                System.out.println("2. Avarage of 3 Numbers");
                System.out.println("Input Choice from 1 - 2: ");

                choice = sc.nextInt();
            } while (choice < 1 || choice > 3);

            Average average = new Average();

            if (choice == 1) {
                System.out.print("Input Number: ");
                average.setdata1(sc.nextInt());
                System.out.print("Input Number: ");
                average.setdata2(sc.nextInt());

                average.Add();
                average.Subtract();
                average.Divide();
                average.Multiply();

                System.out.println("Sum: " + average.getSum());
                System.out.println("Difference: " + average.getDifferent());
                System.out.println("Product: " + average.getProduct());
                System.out.println("Quotient: " + average.getQuotient());
            }

            else {
                System.out.print("Input Number: ");
                average.setdata1(sc.nextInt());
                System.out.print("Input Number: ");
                average.setdata2(sc.nextInt());
                System.out.print("Input Number: ");
                average.setdata3(sc.nextInt());
                average.setAverage();
                System.out.println("Average: " + average.getAverage());
            }
        }

        catch (InputMismatchException error) {
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}
