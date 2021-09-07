package 알고리즘_백준;

import java.util.Scanner;

public class Bronze1_설탕배달_2839_2ndtry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sugar = scanner.nextInt();
        int digit = 0;
        int count = 0;
        if (sugar ==4 || sugar == 7) {
            System.out.println(-1);
        } else {
            do {
                digit = (sugar-3*count);
                count++;
            } while (digit%5 != 0);
            System.out.println(digit/5+count-1);
        }
    }
}
