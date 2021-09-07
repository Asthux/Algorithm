package 알고리즘_백준;

import java.util.Scanner;

public class Bronze1_더하기사이클_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int enNum = firstNum;
        int count = 0;
        while (true){
            int plus = enNum/10 + enNum%10;
            int newNum = enNum%10*10 + plus%10;
            enNum = newNum;
            count++;
            if (enNum == firstNum){
                break;
            }
        }
        System.out.println(count);
    }
}