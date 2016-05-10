import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        for (int i=0;i<T;i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            int N = input.nextInt();
            for (int j = 0; j < N; j++) {
                int sum = a;
                for (int k = 0; k <= j; k++) {
                    sum += Math.pow(2, k) * b;
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
