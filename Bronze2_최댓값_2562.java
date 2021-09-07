package 알고리즘_백준;

import java.util.Scanner;

public class Bronze2_최댓값_2562 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] maxNumber = new int[9];
        int value = 0;
        int index = 0;
        for (int i=0; i<maxNumber.length; i++){
            maxNumber[i] = scanner.nextInt();
            if (value<maxNumber[i]) {
                value = maxNumber[i];
                index = i;
            }
        }
        System.out.println(value);
        System.out.println(index+1);
    }
}
