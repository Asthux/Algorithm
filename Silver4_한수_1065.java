package 알고리즘_백준;

import java.util.Scanner;

public class Silver4_한수_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 0;
        if (N < 100){
            System.out.println(N);
        }
        else {
            for (int i=100; i<=N; i++){
                int a = i/100;
                int b = (i%100)/10;
                int c = i%10;
                if (a-b == b-c){
                    cnt++;
                }
            }
            System.out.println(99+cnt);
        }
    }
}
