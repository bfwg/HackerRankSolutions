import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int sum = 0;
        int n;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for(int i = 0; i < n; i++) {
           sum += input.nextInt();
        }

        System.out.println(sum);

    }
}
