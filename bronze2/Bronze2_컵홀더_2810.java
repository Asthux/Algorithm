package 알고리즘_백준.bronze2;

import java.util.Scanner;

public class Bronze2_컵홀더_2810 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] count = new int[2];
        int num = scanner.nextInt();
        scanner.nextLine();
        String seat = scanner.nextLine();
        for (int i=0; i<num; i++){
            if (seat.charAt(i)==83){
                count[0]++;
            }
            else {
                count[1]++;
            }
        }
        if (count[1]==0){
            System.out.println(count[0]);
        }
        else{
            System.out.println(1+count[0]+count[1]/2);
        }
    }
}
