package 알고리즘_백준.bronze1;

import java.util.Scanner;

public class Bronze1_2007년_1924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int [] arr = {31,28,31,30,31,30,31,31,30,31,30};
        for (int i=0; i<month-1; i++){
            day += arr[i];
        }
       switch (day%7){
           case 0:
               System.out.println("SUN");
               break;
           case 1:
               System.out.println("MON");
               break;
           case 2:
               System.out.println("TUE");
               break;
           case 3:
               System.out.println("WED");
               break;
           case 4:
               System.out.println("THU");
               break;
           case 5:
               System.out.println("FRI");
               break;
           case 6:
               System.out.println("SAT");
               break;
       }
    }
}
