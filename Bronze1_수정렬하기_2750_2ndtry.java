package 알고리즘_백준;

import java.util.Arrays;
import java.util.Scanner;

public class Bronze1_수정렬하기_2750_2ndtry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] order = new int[N];
        for (int i=0; i<N; i++){
            order[i] = scanner.nextInt();
        }
        Arrays.sort(order);
        for (int o : order){
            System.out.println(o);
        }
    }
}
