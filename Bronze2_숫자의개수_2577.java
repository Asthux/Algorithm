package 알고리즘_백준;

import java.util.Scanner;

public class Bronze2_숫자의개수_2577 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int abc = scanner.nextInt()*scanner.nextInt()*scanner.nextInt();
        scanner.close();

        String Number = Integer.toString(abc);

        for (int i = 48; i < 58; i++){
            int Numcount = 0;
            for (int j = 0; j < Number.length(); j++) {
                if (Number.charAt(j) == (char)i) {
                    Numcount++;
                }
            }
            System.out.println(Numcount);

        }
    }
}
