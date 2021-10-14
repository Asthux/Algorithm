package 알고리즘_백준;

import java.util.Scanner;

public class Silver4_터렛_1002 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i=0; i<t; i++){
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int r1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int r2 = scanner.nextInt();

            double a = Math.pow(x1-x2, 2);
            double b = Math.pow(y1-y2, 2);
            double distance = a+b;

            if (x1 == x2 && y1 == y2 && r1 == r2){
                System.out.println(-1);
            }
            else if(distance > Math.pow(r1 + r2, 2)) {
                System.out.println(0);
            }
            else if(distance < Math.pow(r2 - r1, 2)) {
                System.out.println(0);
            }
            else if(distance == Math.pow(r2 - r1, 2)) {
                System.out.println(1);
            }
            else if(distance == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            }
            else {
                System.out.println(2);
            }
        }
    }
}
