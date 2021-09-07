package 알고리즘_백준;

import java.util.Scanner;

public class Silver5_소수_2581 {
    public static boolean isPrime(int num){
        if (num<2){
            return false;
        }
        for (int i=2; i*i<=num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int min = 0;
        for (int i=b; i>=a; i--){
            if (isPrime(i)){
                sum += i;
                min = i;
            }
        }
        if (sum == 0){
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
