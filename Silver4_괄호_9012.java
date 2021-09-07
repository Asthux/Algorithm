package 알고리즘_백준;

import java.util.Scanner;
import java.util.Stack;

public class Silver4_괄호_9012 {
    public static String solve(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            }
            else if (stack.empty()) {
                return "NO";
            }
            else {
                stack.pop();
            }
        }
        /*
         * 모든 검사 마치고 스택에 잔여 요소가 있으면 여는 괄호가 많은 경우는 "NO"
         * 스택이 비어있으면 온전한 수식이므로 "YES" 이다.
         */
        if (stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i=0; i<N; i++){
            System.out.println(solve(scanner.next()));
        }
    }
}
