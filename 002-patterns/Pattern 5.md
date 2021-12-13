# Pattern 5

> 1. You are given a number n.
> 2. You've to create a pattern of * and separated by tab as shown in output format.

```text
Input Format
A number n
Output Format
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	

Constraints
1 <= n <= 100
 Also, n is odd.
Sample Input
5
Sample Output
		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	
```

## Notes

![Screenshot 2021-12-13 at 8 48 42 PM](https://user-images.githubusercontent.com/28717686/145839382-f39c7fe9-ffea-466b-88c5-5f6275b355c5.png)

## Solution

```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nsp = n/2, nst = 1;
        for(int r = 1; r <= n; r++) {
            // spaces
            for(int csp = 1; csp <= nsp; csp++) {
                System.out.print("\t");
            }
            // stars
            for(int cst = 1; cst <= nst; cst++) {
                System.out.print("*\t");
            }
            if(r <= n/2) {
                nsp--;
                nst += 2;
            }
            else {
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }

    }
}
```
