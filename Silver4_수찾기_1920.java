package 알고리즘_백준;

import java.io.*;
import java.util.ArrayList;

public class Silver4_수찾기_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        int num = Integer.parseInt(String.valueOf(br.readLine().split(" ")));
        for (int i=0; i<N; i++){
            num = 0;
        }
        int M = Integer.parseInt(br.readLine());
        for (int i=0; i<M; i++){
            if (arrayList.contains(br.read()-48)){
                bw.write(1+"\n");
            }
            else {
                bw.write(0+"\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
