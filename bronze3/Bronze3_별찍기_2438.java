package 알고리즘_백준.bronze3;

import java.util.Scanner;

public class Bronze3_별찍기_2438 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for(int i=1; i<=N; i++){
            for(int j = 0; j<i; j++ ){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
