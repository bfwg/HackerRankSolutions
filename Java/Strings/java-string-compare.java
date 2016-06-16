import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        int arrLen = s.length() - n + 1;
        String[] sArr = new String[arrLen];
        for(int i=0; i<arrLen; i++) {
            sArr[i] = s.substring(i, i+n);
        }
        Arrays.sort(sArr);
        
        System.out.println(sArr[0]);
        System.out.println(sArr[sArr.length-1]);
        
        
    }
}
