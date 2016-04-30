import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();

        input = input.replaceAll("\\s+", "");
        input = input.toLowerCase();
        String[] sa =  input.split("(?<!^)");
        HashSet<String> aset = new HashSet<String>(Arrays.asList(sa));
        //for(int i=0; i< sa.length; i++) {
        //   System.out.println(sa[i]);
        //}
        //aset.forEach(System.out::println);
        if(aset.size() < 26) {
           System.out.println("not pangram");
        } else {
           System.out.println("pangram");
        }
    }
}
