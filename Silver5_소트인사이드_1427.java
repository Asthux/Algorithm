package 알고리즘_백준;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class Silver5_소트인사이드_1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        Integer [] reverseNum = new Integer[num.length()];

        for (int i=0; i<num.length(); i++){
            reverseNum[i] = (num.charAt(i)-48);
        }
        Arrays.sort(reverseNum, Collections.reverseOrder());
        for (int a : reverseNum){
            System.out.print(a);
        }
    }
}
