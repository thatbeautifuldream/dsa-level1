import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = rotateNumber(n, k);
        System.out.println(ans);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }

    public static int rotateNumber(int n, int k) {
        int len = countDigits(n);
        k = ((k % len) + len) % len;
        int div = 1, mul = 1;
        div = (int) Math.pow(10, k);
        mul = (int) Math.pow(10, len - k);
        int a = n / div;
        int b = n % div;
        return (b * mul + a);
    }
}