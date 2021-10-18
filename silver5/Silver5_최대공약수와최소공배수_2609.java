package 알고리즘_백준.silver5;

import java.util.Scanner;

public class Silver5_최대공약수와최소공배수_2609 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a*b;
        if (a<b){
            int tmp = a;
            a = b;
            b = tmp;
        }
        while(true){
            int r1 = a%b;
            if (r1==0){
                break;
            }
            a=b;
            b=r1;
        }
        System.out.println(b);
        System.out.println(c/b);
    }
}
