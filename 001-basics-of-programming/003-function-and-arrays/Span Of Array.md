# Span Of Array

> 1. You are given a number n, representing the count of elements.
> 2. You are given n numbers.
> 3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

```
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max - min

Constraints
1 <= n <= 10^4
0 <= n1, n2
 .. n elements <= 10 ^9
Sample Input
6
15
30
40
4
11
9
Sample Output
36
```

## Notes




## Solution

```java
import java.io.*;
import java.util.*;

public class Main{

    public static int max(int[] a) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    
    public static int min(int[] a) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }
    
    public static int span(int[] a){
        return (max(a) - min(a));
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(span(a));
    }
}
    
```