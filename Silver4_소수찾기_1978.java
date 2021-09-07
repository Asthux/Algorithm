package 알고리즘_백준;

import java.util.Scanner;

public class Silver4_소수찾기_1978 {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int cnt = 0;
        for (int i=0; i<N; i++){
            if (isPrime(scanner.nextInt())){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
