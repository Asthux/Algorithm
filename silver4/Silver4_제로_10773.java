package 알고리즘_백준.silver4;

import java.util.Scanner;
import java.util.Stack;

public class Silver4_제로_10773 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i=0; i<k; i++){
            int tmp = in.nextInt();
            if (tmp != 0) {
                stack.push(tmp);
            }else {
                stack.pop();
            }
        }

        for (int n : stack){
            result += n;
        }
        System.out.println(result);
    }
}
