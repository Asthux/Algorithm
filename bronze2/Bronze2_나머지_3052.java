package 알고리즘_백준.bronze2;

import java.util.HashSet;
import java.util.Scanner;

public class Bronze2_나머지_3052 {
    public static void main(String[] args) {
        HashSet<Integer> devide = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<10; i++){
            devide.add(scanner.nextInt()%42);
        }
        System.out.println(devide.size());
    }
}
