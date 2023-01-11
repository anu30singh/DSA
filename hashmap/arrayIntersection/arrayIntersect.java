import java.util.HashMap;
public class arrayIntersect {
    public static void Print(int arr[] , int arr2[]) {
        HashMap <Integer , Integer> map = new HashMap<> ();
        for (int i=0; i < arr.length ; i++) {
if (map.containsKey(arr[i])) {
    int val= map.get(arr[i]);
    map.put(arr[i] , val+1);
} else {    //hello
    map.put(arr[i] , 1);
}
        }
        for (int i=0; i<arr2.length ; i++) {
            if (map.containsKey (arr2[i])) {
                int freq = map.get(arr2[i]);
                if (freq>0) {
                    System.out.print(arr2[i] + " ");
                    map.put(arr2[i] , freq-1);
                }
            }
        }
    }
    public static void main (String args[]) {
     int arr[] = {10 , 12 , 13 , 14 ,7};
     int arr1[] = {10, 111, 123, 54 , 7};
     Print(arr , arr1);
    }
}