import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDigits(n);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static void printDigits(int n) {
        int len = countDigits(n);
        int div = (int) Math.pow(10, len - 1);
        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n %= div;
            div /= 10;
        }
    }
}