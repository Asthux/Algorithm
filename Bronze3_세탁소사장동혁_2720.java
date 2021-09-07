package 알고리즘_백준;

import java.util.Scanner;

public class Bronze3_세탁소사장동혁_2720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;
        int T = scanner.nextInt();
        for (int i=0; i<T; i++){
            int change = scanner.nextInt();
            System.out.print(change/quarter+" ");
            System.out.print((change%quarter)/dime+" ");
            System.out.print(((change%quarter)%dime)/nickel+" ");
            System.out.print((((change%quarter)%dime)%nickel)/penny);
            System.out.println();
        }
    }
}
