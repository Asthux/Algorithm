package 알고리즘_백준;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Silver5_좌표정렬하기_11650 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] coordinate = new int[num][2];
        for (int i=0; i<num; i++) {
           coordinate[i][0] = scanner.nextInt();
           coordinate[i][1] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(coordinate, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }
            }
        });
        for (int i=0; i<coordinate.length; i++){
            for (int j=0; j<coordinate[i].length; j++){
                System.out.print(coordinate[i][j]+" ");
            }
            System.out.println();
        }
    }
}
