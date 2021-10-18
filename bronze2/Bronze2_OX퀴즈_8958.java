package 알고리즘_백준.bronze2;

import java.util.Scanner;

public class Bronze2_OX퀴즈_8958 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i=0; i<T; i++){
            String st = sc.nextLine();
            int total_cnt = 0;
            int cnt = 0;
            for (int s = 0; s<st.length(); s++){
                if (st.charAt(s) == 'O') {
                    cnt++;
                    total_cnt += cnt;
                }
                else {
                    cnt = 0;
                }
            }
            System.out.println(total_cnt);
        }sc.close();
    }
}


