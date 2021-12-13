import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern13(n);
    }

    public static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    // Returns factorial of n
    public static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    public static void pattern13(int n) {
        int nst = 1;
        for (int r = 1; r <= n; r++) {
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(nCr(r - 1, cst - 1) + "\t");
            }
            nst++;
            System.out.println();
        }
    }
}