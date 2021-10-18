package 알고리즘_백준.silver4;

import java.util.Scanner;

public class Silver4_소인수분해_11653 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N == 1){
            System.out.println();
        }else {
            for (int i=2; i<=N; i++){
                int mod = N%i;
                if(mod == 0){
                    System.out.println(i);
                    N = N/i;
                    i--;
                }
            }
        }
    }
}
