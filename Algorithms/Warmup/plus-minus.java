import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        DecimalFormat df = new DecimalFormat("#.#####");
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            int temp = in.nextInt();
            if (temp > 0) {
                positive++;
            } else if(temp == 0){
                zero++;
            } else {
                negative++;
            }
        }
        System.out.println(df.format(positive/n));
        System.out.println(df.format(negative/n));
        System.out.println(df.format(zero/n));
    }

}

