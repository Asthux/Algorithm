package 알고리즘_백준;

import java.util.Scanner;

public class Bronze4_두수비교하기_1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b){
            System.out.println(">");
        }
        else if (a < b){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }
}
