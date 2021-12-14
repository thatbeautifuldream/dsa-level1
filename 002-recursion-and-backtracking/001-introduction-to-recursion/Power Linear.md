# Power-linear

> 1. You are given a number x.
> 2. You are given another number n.
> 3. You are required to calculate x raised to the power n. Don't change the signature of power function .
> `Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.`

```
Input Format
A number x
A number n
Output Format
x raised to the power n

Constraints
1 <= x <= 10
0 <= n <= 9
Sample Input
2
5
Sample Output
32
```
## Notes

![Screenshot 2021-12-14 at 9 23 41 PM](https://user-images.githubusercontent.com/28717686/146032832-0accc6ab-bfc6-453f-bdd1-2700610ba041.png)


## Solution

```java
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }

    public static int power(int x, int n){
        return (n == 0) ? 1 : x * power(x, n - 1);
    }

}
```
