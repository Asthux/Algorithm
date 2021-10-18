package 알고리즘_백준.bronze3;

import java.util.Scanner;

public class Bronze3_구구단_2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int i = 1; i<10; i++){
            System.out.println(N+" * "+i+" = "+ N*i);
        }
    }
}
