# Digit Frequency

> 1. You are given a number n.
> 2. You are given a digit d.
> 3. You are required to calculate the frequency of digit d in number n.

```
Input Format
A number n
A digit d
Output Format
A number representing frequency of digit d in number n

Constraints
0 <= n <= 10^9
0 <= d <= 9
  
Sample Input
994543234
 4
Sample Output
3
```

## Notes

![Screenshot 2021-12-14 at 6 45 33 PM](https://user-images.githubusercontent.com/28717686/146005377-011badc2-b2fb-42eb-84eb-29ef0d7b8a29.png)

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int count = 0;
        while(n != 0) {
            int rem = n%10;
            n /= 10;
            if(rem == d) {
                count++;
            }
        }
        return count;
    }
}
```
