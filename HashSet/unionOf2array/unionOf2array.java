
import java.util.*;
public class unionOf2array {
    public static int uniona(int arr1[], int arr2[]) {
        HashSet <Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);

        }
        for(int i=0; i<arr2.length; i++) {
            set.add(arr2[i]);

        }
        return set.size();

    }
    public static void main(String[] args) {
        int arr1[] = {3,5,6};
        int arr2[]= {1,3,5,6,8,10};
        System.out.println(uniona(arr1, arr2));
    }
}
