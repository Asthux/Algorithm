package 알고리즘_백준;

import java.util.Scanner;

public class Silver5_크로아티아알파벳_2941 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a =a.replace("c=","x");
        a =a.replace("c-","x");
        a =a.replace("dz=","x");
        a =a.replace("d-","x");
        a =a.replace("lj","x");
        a =a.replace("nj","x");
        a =a.replace("s=","x");
        a =a.replace("z=","x");
        System.out.println(a.length());
    }
}
