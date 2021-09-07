package 알고리즘_백준;

import java.util.Scanner;

public class Bronze1_피보나치수2_2748 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        long su1 = 0;
        long su2 = 1;
        long su3 = 0;
        while (N>0){
            su3 = su1+su2;
            su1 = su2;
            su2 = su3;
            count++;
            if (count == N) {
                break;
            }
        }
        System.out.println(su1);
    }
}
