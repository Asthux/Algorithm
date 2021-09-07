package 알고리즘_백준;

import java.util.Scanner;
import java.util.Arrays;

public class Bronze1_평균_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] score = new int[N];
        int sumScore = 0;
        for (int i=0; i<score.length;i++){
            score[i] = scanner.nextInt();
            sumScore += score[i];
        }
        Arrays.sort(score);
        int maxScore = score[N-1];
        System.out.println((double)sumScore/maxScore*100/N);
    }
}
