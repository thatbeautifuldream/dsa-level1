import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1, nsp = n - 1;
        for (int r = 1; r <= n; r++) {
            // spaces
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }
    }
}