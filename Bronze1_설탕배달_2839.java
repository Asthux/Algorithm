package 알고리즘_백준;

import java.util.Scanner;

public class Bronze1_설탕배달_2839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sugar = scanner.nextInt();
        if (sugar ==4 || sugar == 7){
            System.out.println(-1);
        }   else if (sugar%5 == 0) {
            System.out.println(sugar / 5);
            }
            else if (sugar%5 == 1){
            System.out.println((sugar-6)/5+2);
            }
            else if (sugar%5 == 2){
            System.out.println((sugar-12)/5+4);
            }
            else if (sugar%5 == 3){
            System.out.println((sugar-3)/5+1);
            }
            else if (sugar%5 == 4){
            System.out.println((sugar-9)/5+3);
            }
    }
}
