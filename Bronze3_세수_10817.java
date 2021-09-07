package 알고리즘_백준;

import java.util.Scanner;
import java.util.Arrays;
public class Bronze3_세수_10817 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int arr[] = {scanner.nextInt(), scanner.nextInt(),scanner.nextInt()};
        scanner.close();
        Arrays.sort(arr);

        System.out.println(arr[1]);
    }

}

