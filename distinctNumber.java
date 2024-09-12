import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class distinctNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n ; i++) {
            int ele = s.nextInt();
            list.add(ele);
        }
        HashSet <Integer> set = new HashSet<>(list);
       
        System.out.println(set.size());
    }
}
