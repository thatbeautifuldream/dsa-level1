import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countDigits(n);
    }

    public static void countDigits(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n /= 10;
        }
        System.out.println(count);
    }
}