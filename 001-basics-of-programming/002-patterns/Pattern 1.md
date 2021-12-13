# Pattern 1

>1. You are given a number n.
>2. You've to create a pattern of * and separated by tab as shown in output format.

```text
Input Format
A number n
Output Format
*
*    *
*    *    *
*    *    *    *

Constraints
1 <= n <= 100
Sample Input
2
Sample Output
*	
*	*

```

## Notes

![Screenshot 2021-12-13 at 7 15 03 PM](https://user-images.githubusercontent.com/28717686/145824005-c29152c8-35e6-484a-847b-30b511c4e6e1.png)

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        for(int r = 1; r <= n; r++) {
            for(int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nst++;
            System.out.println();
        }

    }
}
```
