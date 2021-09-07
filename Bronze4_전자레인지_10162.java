package 알고리즘_백준;

import java.util.Scanner;

public class Bronze4_전자레인지_10162 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int a = 300;
        int b = 60;
        int c = 10;
        if (T%c==0){
            System.out.print(T/a+" ");
            System.out.print((T%a)/b+" ");
            System.out.print(((T%a)%b)/c);
        }
        else {
            System.out.println(-1);
        }
    }
}
