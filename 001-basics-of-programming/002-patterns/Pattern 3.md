# Pattern 3

> 1. You are given a number n.
> 2. You've to create a pattern of * and separated by tab as shown in output format.

```text
Input Format
A number n
Output Format
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	
Constraints
1 <= n <= 10
Sample Input
5
Sample Output
				*	
			*	*	
		*	*	*	
	*	*	*	*	
*	*	*	*	*	
```
## Notes

![Screenshot 2021-12-13 at 7 36 38 PM](https://user-images.githubusercontent.com/28717686/145827701-b1effd21-8b0b-40c5-b469-dcfdb537f2cc.png)

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n - 1, nst = 1;
        for(int r = 1; r <= n; r++) {
            // spaces
            for(int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for(int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            nsp--;
            nst++;
            System.out.println();
        }

    }
}
```
