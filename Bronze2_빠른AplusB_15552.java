package 알고리즘_백준;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Bronze2_빠른AplusB_15552 {
    public static void main(String[] args) throws IOException {
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기
            StringTokenizer st;
            int T = Integer.parseInt(br.readLine());
            for (int i = 0; i<T;i++){
                st = new StringTokenizer(br.readLine());
                bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
            }
            bw.close();   //스트림을 닫음
        }
    }
}