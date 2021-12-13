# Pattern 4

> 1. You are given a number n.
> 2. You've to create a pattern of * and separated by tab as shown in output format.

```text
Input Format
A number n
Output Format
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*

Constraints
1 <= n <= 100
Sample Input
5
Sample Output
*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*
```
## Notes

![Screenshot 2021-12-13 at 7 48 15 PM](https://user-images.githubusercontent.com/28717686/145829494-1401ba22-ca3c-4686-be04-6162f5189c2d.png)

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = 0, nst = n;
        for(int r = 1; r <= n; r++) {
            // spaces
            for(int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for(int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            //update expressions
            nsp++;
            nst--;
            System.out.println();
        }

    }
}
```
