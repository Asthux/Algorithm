package 알고리즘_백준.bronze1;

import java.util.Scanner;

public class Bronze1_평균은넘겠지_4344 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for (int i=0; i<test; i++){
            int N = scanner.nextInt();
            int [] arr = new int[N];
            int sum = 0;
            for (int j=0; j<N; j++){
                arr[j] = scanner.nextInt();
                sum += arr[j];
            }
            int avg = sum/N;
            int cnt = 0;
            for (int j=0; j<N; j++){
                if (avg < arr[j]){
                    cnt++;
                }
            }
            double ratio = (double)cnt/(double)N * 100;
            System.out.println(String.format("%,.3f",ratio) + "%");
        }
    }
}
