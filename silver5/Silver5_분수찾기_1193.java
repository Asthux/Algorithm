package Algorithm.silver5;

import java.util.Scanner;

public class Silver5_분수찾기_1193 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int cnt = 1;

    do {
      n = n - cnt;
      cnt++;
    } while (n > 0);

    n = Math.abs(n);

    if (cnt % 2 == 0) {
      int molecule = 1 + n;
      int denominator = cnt - molecule;
      System.out.println(molecule + "/" + denominator);
    } else {
      int denominator = 1 + n;
      int molecule = cnt - denominator;
      System.out.println(molecule + "/" + denominator);
    }
  }
}