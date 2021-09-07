package 알고리즘_백준;

import java.io.*;
import java.util.Arrays;
public class Silver5_수정렬하기2_2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(bufferedReader.readLine());
        int[] num = new int[N];
        for (int i=0; i<num.length; i++){
            num[i] = Integer.parseInt(bufferedReader.readLine());
        }
        bufferedReader.close();
        Arrays.sort(num);
        for (int i=0; i<num.length; i++){
            bufferedWriter.write(num[i]+"\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

