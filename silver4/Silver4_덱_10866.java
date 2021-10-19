package 알고리즘_백준.silver4;

import java.io.*;
import java.util.ArrayDeque;

public class Silver4_덱_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "push_front":
                    deque.addFirst(Integer.parseInt(cmd[1]));
                    break;
                case "push_back":
                    deque.addLast(Integer.parseInt(cmd[1]));
                    break;
                case "pop_front":
                    if (deque.size() == 0) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.removeFirst() + "\n");
                    }
                    break;
                case "pop_back":
                    if (deque.size() == 0) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(deque.removeLast() + "\n");
                    }
                    break;
                case "size":
                    bw.write(deque.size() + "\n");
                    break;
                case "empty":
                    if (deque.size() == 0) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "front":
                    if (deque.size() == 0){
                        bw.write("-1" + "\n");
                    }
                    else {
                        bw.write(deque.getFirst() + "\n");
                    }
                    break;
                case "back":
                    if (deque.size() == 0){
                        bw.write("-1" + "\n");
                    }
                    else {
                        bw.write(deque.getLast() + "\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
