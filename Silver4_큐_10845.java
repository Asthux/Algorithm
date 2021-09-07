package 알고리즘_백준;

import java.util.*;
import java.io.*;

public class Silver4_큐_10845 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int back = 0;
        for (int i=0; i<N; i++){
            String[] cmd = br.readLine().split(" ");
            switch (cmd[0]) {
                case "push":
                    back = Integer.parseInt(cmd[1]);
                    queue.offer(back);
                    break;
                case "pop":
                    if (queue.isEmpty()){
                        bw.write("-1"+ "\n");
                    }
                    else {
                        bw.write(queue.poll()+"\n");
                    }
                    break;
                case "size":
                    bw.write(queue.size()+"\n");
                    break;
                case "empty":
                    if (queue.isEmpty()){
                        bw.write("1" + "\n");
                    }
                    else {
                        bw.write("0" + "\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()){
                        bw.write("-1"+"\n");
                    }
                    else {
                        bw.write(queue.peek()+"\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()){
                        bw.write("-1" + "\n");
                    }
                    else {
                        bw.write(back +"\n");
                    }
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}
