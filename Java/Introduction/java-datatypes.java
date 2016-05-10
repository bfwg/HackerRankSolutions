import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                double byteRange = Math.pow(2, 8)/2;
                double shortRange = Math.pow(2, 16)/2;
                double intRange = Math.pow(2, 32)/2;
                double longRange = Math.pow(2, 64)/2;
                if(x>=-byteRange && x<=byteRange-1)System.out.println("* byte");
                if(x>=-shortRange && x<=shortRange-1)System.out.println("* short");
                if(x>=-intRange && x<=intRange-1)System.out.println("* int");
                if(x>=-longRange && x<=longRange-1)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
