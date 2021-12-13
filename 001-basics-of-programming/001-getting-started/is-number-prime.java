import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            isPrime(n);
        }

    }

    public static void isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}