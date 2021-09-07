package 알고리즘_백준;

import java.util.Scanner;

public class Bronze1_단어공부_1157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count[] = new int[26];
        for (int i=0; i< word.length(); i++){
            count[Character.toUpperCase(word.charAt(i))-65]++;
        }
        int max = 0;
        int maxIndex = 0;
        boolean same = false;
        for (int i=0; i< count.length; i++){
            if(count[i]>max){
                max = count[i];
                maxIndex = i;
                same = false;
            }
            else if (count[i] == max) {
                same = true;
            }
        }
        if (same){
            System.out.println("?");
        }
        else {
            System.out.println((char)(maxIndex+65));
        }
    }
}
