package 알고리즘_백준;

import java.util.Scanner;

public class Bronze1_이항계수_11050 {
    public static int Factorial(int fact){
        if (fact<=0){
            return 1;
        }else {
            return fact*Factorial(fact-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(Factorial(n)/(Factorial(k)*Factorial(n-k)));
    }
}
