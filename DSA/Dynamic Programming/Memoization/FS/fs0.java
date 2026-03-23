import java.util.Scanner;

public class fs0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("The number is : " + n);

        int m = 0;
        for (int i = 0; i < n; i++) {
            if (n <= 0)
                m = 0;
            if (n <= 2)
                m = 1;
            if (n > 2)
                m = (n - 2) + (n - 1);
        }

        System.out.println("The fibonacci number is : " + m + "\n Want to continue:");
        int a = sc.nextInt();
        if (a == 1)
            main(args);
        else
            System.out.println("Thank you for using the program");

        sc.close();
    }
}
