import java.util.Scanner;

public class NaturalSumFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;

            int forSum = 0;

            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            System.out.println("Formula Sum = " + formulaSum);
            System.out.println("For Loop Sum = " + forSum);
            System.out.println("Both are equal = "
                    + (formulaSum == forSum));
        }

        sc.close();
    }
}