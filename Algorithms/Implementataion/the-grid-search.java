import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static boolean gridSearch(String G[], String P[]) {
        for(int i=0; i<G.length-P.length+1;i++){
            for(int j=0; j<G[0].length()-P[0].length()+1; j++) {
                if(G[i].charAt(j)==P[0].charAt(0)) {
                    int si=i;
                    int sj=j;
                    verify: {
                        for(int x=0; x<P.length; x++) {
                                for(int y=0; y<P[0].length(); y++) {
                                    if(G[si].charAt(sj)!=P[x].charAt(y)) {
                                       break verify;
                                    }else if(x==P.length-1&&y==P[x].length()-1) {
                                        return true;
                                    }
                                    sj++;
                                }
                                sj-=P[x].length();
                                si++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            System.out.println(gridSearch(G, P) ? "YES" : "NO");
        }
    }

}

