package 알고리즘_백준;

import java.util.ArrayList;

public class Silver5_셀프넘버_4673 {
    public static void main(String[] args) {
        ArrayList<Integer> notSN = new ArrayList<Integer>();
        ArrayList<Integer> selfNum = new ArrayList<Integer>();
        for (int i=1; i<10000; i++){
            notSN.add(i-1, i+i/1000+i%1000/100+i%100/10+i%10);
        }
        for (int i=1; i<=10000; i++){
            selfNum.add(i-1,i);
        }
        for (Integer i : selfNum){
            if (!notSN.contains(i)){
                System.out.println(i);
            }
        }
    }
}