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
        }

        catch (InputMismatchException error) {
            System.out.println(error.getMessage());
        }
        sc.close();
    }
}
