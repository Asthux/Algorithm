package 알고리즘_백준.bronze4;

import java.util.Scanner;
public class Bronze4_Testscore_9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 90){
            System.out.println("A");
        }
        else if (79< a && a <90){
            System.out.println("B");
        }
        else if (69< a && a <80){
            System.out.println("C");
        }
        else if (59< a && a <70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
