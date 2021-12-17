# Matrix Multiplication

> 1. You are given a number n1, representing the number of rows of 1st matrix.
> 2. You are given a number m1, representing the number of columns of 1st matrix.
> 3. You are given n1*m1 numbers, representing elements of 2d array a1.
> 4. You are given a number n2, representing the number of rows of 2nd matrix.
> 5. You are given a number m2, representing the number of columns of 2nd matrix.
> 6. You are given n2*m2 numbers, representing elements of 2d array a2.
> 7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
> 8. If the two arrays can't be multiplied, print "Invalid input".


```
Input Format
A number n1
A number m1
e11
e12..
e21
e22..
.. n1 * m1 number of elements of array a1
A number n2
A number m2
e11'
e12'..
e21'
e22'..
.. n2 * m2 number of elements of array a2
Output Format
e11' e12' e13' ..
e21' e22' e23' ..
.. elements of prd array

Constraints
1 <= n1 <= 10^2
1 <= m1 <= 10^2
-10^9 <= e11, e12, .. n1 * m1 elements <= 10^9
1 <= n2 <= 10^2
1 <= m2 <= 10^2
-10^9 <= e11', e12', .. n2 * m2 elements <= 10^9
Sample Input
2
3
10
0
0
0
20
0
3
4
1
0
1
0
0
1
1
2
1
1
0
0
Sample Output
10 0 10 0
0 20 20 40
```

## Notes

![Screenshot 2021-12-17 at 4 42 02 PM](https://user-images.githubusercontent.com/28717686/146536282-9307dd91-f9c9-4c9b-a869-80176bbbedaf.png)

## Solution

```java
import java.io.*;
import java.util.*;

public class Main{

    public static void matrixMult(int[][] a1, int r1, int c1, int[][] a2, int r2, int c2) {
        if(c1 != r2) {
            System.out.println("Invalid input");
            return;
        }
        int[][] ans = new int[r1][c2];
        for(int r = 0; r < ans.length; r++) {
            for(int c = 0; c < ans[0].length; c++) {
                for(int k = 0 ;k < c1; k++) {
                    ans[r][c] += a1[r][k] * a2[k][c];
                }
                System.out.print(ans[r][c] + " ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a1 = new int[r1][c1];
        for(int r = 0; r < r1; r++) {
            for(int c = 0; c < c1; c++) {
                a1[r][c] = sc.nextInt();
            }
        }
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] a2 = new int[r2][c2];
        for(int r = 0; r < r2; r++) {
            for(int c = 0; c < c2; c++) {
                a2[r][c] = sc.nextInt();
            }
        }
        matrixMult(a1,r1,c1,a2,r2,c2);
    }

}
```
