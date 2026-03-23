
//Fibonacci Series using Dynamic Programming (Memoization)
import java.util.Scanner; //import Scanner class for user input

public class fs1 {
    // Separate function for fibonacci series
    public static int fibonacci(int n) {
        if (n <= 0)
            return 0;
        if (n <= 2)
            return 1;

        int m[] = new int[n + 1];
        m[0] = 0;
        m[1] = 1;
        m[2] = 1;

        for (int i = 3; i <= n; i++) {
            if (n >= 3)
                m[i] = m[i - 1] + m[i - 2];
            System.out.println("Processing index " + i + ": " + m[i]);
        }

        return m[n];
    }

    // Main function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // scanner object

        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("The number is : " + n);
        System.out.println("The fibonacci number at place " + n + " is : " + fibonacci(n)
                + "\nWant to continue (1 for yes): ");

        int a = sc.nextInt();

        if (a == 1)
            main(args);
        else
            System.out.println("Thank you for using the program");

        sc.close(); // close scanner
    }
}
