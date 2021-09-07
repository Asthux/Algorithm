package 알고리즘_백준;

import java.util.*;

public class Silver5_단어정렬_1181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int repeat = scanner.nextInt();
        Set<String> set = new HashSet<String>();
        scanner.nextLine();
        for (int i=0; i< repeat; i++){
            set.add(scanner.nextLine());
        }
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()-o2.length()>0){
                    return 1;
                }
                else if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else {
                    return -1;
                }
            }
        });

        for (String a : list){
            System.out.println(a);
        }
    }
}
