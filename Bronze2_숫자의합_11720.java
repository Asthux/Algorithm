package 알고리즘_백준;

import java.util.Scanner;

public class Bronze2_숫자의합_11720 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();// 첫 변수 이후 enter 후 두번째 변수가 주어지기 때문에 개행문자를 없애줘야
        String num = scanner.nextLine();// 두번째 숫자들을 String에 저
        scanner.close();

        int sum = 0; // 초기

        for(int i = 0; i < num.length();i++){
            sum+= num.charAt(i) - '0';// 아스키코드 참조. 아스키코드에서 48인 0을 빼주면 int로 변환 가능
        }
        System.out.println(sum);
    }
}
