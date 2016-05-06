import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String[] Braces(String[] values) {
        String[] res = new String[values.length];
        for(int i=0; i<values.length; i++) {
            Stack<Character> stack = new Stack<Character>();
            String testCase = values[i];
            for(int j=0; j<testCase.length(); j++) {
                char c = testCase.charAt(j);
                if(c=='{') {
                   stack.push('{');
                } else if (c=='(') {
                    stack.push('(');
                } else if (c=='[') {
                    stack.push('[');
                } else if (c=='}') {
                    if(!stack.isEmpty() && stack.peek()=='{') {
                        stack.pop();
                    } else {
                        res[i] = "NO";
                    }
                } else if (c==')') {
                    if(!stack.isEmpty() && stack.peek()=='(') {
                        stack.pop();
                    } else {
                        res[i] = "NO";
                    }
                } else if (c==']') {
                    if(!stack.isEmpty() && stack.peek()=='[') {
                        stack.pop();
                    } else {
                        res[i] = "NO";
                    }
                }
            }
            res[i] = stack.isEmpty() ? "YES" : "NO";
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value = in.nextLine();
        String[] valueArr = value.split(" ");
        String[] resArr = Braces(valueArr);
        for(int i=0; i<resArr.length; i++) {
            System.out.println(resArr[i]);
        }
    }
}
