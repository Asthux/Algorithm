package 알고리즘_백준;

import java.util.Arrays;
import java.util.Scanner;

public class Silver5_그룹단어체커_1316 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 0;
        scanner.nextLine();
        for (int i=0; i<N; i++) {
            String word = scanner.nextLine();
            char[] gWord = new char[word.length()];
            char[] checker = new char[word.length()];
            for (int j = 0; j < word.length(); j++) {
                checker[j] = word.charAt(j);
                gWord[j] = word.charAt(j);
            }
            for (int j = 0; j < checker.length - 1; j++) {
                for (int k = j + 1; k < checker.length; k++) {
                    if (checker[j] == checker[k]){
                        char imsi = checker[j+1];
                        checker[j+1] = checker[k];
                        checker[k] = imsi;
                    }
                }
            }
            if(Arrays.equals(gWord, checker)){
                count++;
            }
        }
        System.out.println(count);
    }
}
