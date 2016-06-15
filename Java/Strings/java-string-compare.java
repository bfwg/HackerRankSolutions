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
        String[] sArr = new String[s.length() - 2];
        for(int i=0; i<s.length() - 2; i++) {
            sArr[i] = s.substring(i, i+3);
        }
        Arrays.sort(sArr);
        
        System.out.println(sArr[0]);
        System.out.println(sArr[sArr.length-1]);
        
        
    }
}
