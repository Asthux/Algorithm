package 알고리즘_백준.silver5;

import java.util.Scanner;

public class Silver5_요세푸스문제_1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int person = scanner.nextInt();
        int num = scanner.nextInt();
        int totalCnt = 0;
        int cnt = 1;
        int [] circle = new int[person];
        for (int i=0; i<circle.length; i++){
            circle[i] = i+1;
        }
        System.out.print("<");
        while(totalCnt<person){
            for (int i=0; i< person; i++){
                if (cnt == num && circle[i] != 0){
                    System.out.print(circle[i]);
                    if (totalCnt < person-1){
                        System.out.print(", ");
                    }
                    circle[i] = 0;
                    cnt = 1;
                    totalCnt++;
                }
                else if (circle[i] == 0){
                    continue;
                }
                else {
                    cnt++;
                }
            }
        }
        System.out.print(">");
    }
}
