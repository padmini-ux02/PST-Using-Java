package Tasks;

import java.util.Scanner;

public class NumberStatistics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Number must be greater than 0.");
            return;
        }

        int max = 0;
        int min = 0;
        double sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (i == 1) {
                max = num;
                min = num;
            } else {
                if (num > max) {
                    max = num;
                }

                if (num < min) {
                    min = num;
                }
            }

            sum = sum + num;
        }

        double average = sum / n;

        System.out.println("\n========= RESULT =========");
        System.out.println("Maximum Value : " + max);
        System.out.println("Minimum Value : " + min);
        System.out.printf("Average Value : %.2f\n", average);
        System.out.println("==========================");

        sc.close();
    }
}
