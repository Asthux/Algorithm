package 알고리즘_백준.bronze1;
import java.util.Scanner;
public class Bronze1_피보나치수2_2748_2ndtry {
    public static int Fibonacci(int fibo){
        if(fibo<=1){
            return fibo;
        }else {
            return Fibonacci(fibo-2)+Fibonacci(fibo-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(Fibonacci(N));
    }
}

