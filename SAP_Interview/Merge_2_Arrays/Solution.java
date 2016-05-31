import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<N; i++) {
            int num = in.nextInt();
            result.add(num);
        }
        int M = in.nextInt();
        for(int i=0; i<M; i++) {
            int num = in.nextInt();
            result.add(num);
        }

        Collections.sort(result);
        for(int i : result) {
            System.out.println(i);
        }

    }
}
