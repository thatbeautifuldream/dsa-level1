import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverseNumber(n);
    }

    public static void reverseNumber(int n) {
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }
}