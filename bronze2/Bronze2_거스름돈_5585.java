package 알고리즘_백준.bronze2;

import java.util.Scanner;

public class Bronze2_거스름돈_5585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int money = 1000;
        money -=scanner.nextInt();
        int a = 500;
        int b = 100;
        int c = 50;
        int d = 10;
        int e = 5;
        int f = 1;
        int count = money/a + (money%a)/b + ((money%a)%b)/c + (((money%a)%b)%c)/d + ((((money%a)%b)%c)%d)/e + (((((money%a)%b)%c)%d)%e)/f;
        System.out.println(count);
    }
}
