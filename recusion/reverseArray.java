
import java.util.Scanner;



public class reverseArray {
    public static void swap ( int nums[] , int i , int j) {
        for (int a=0; a<=nums.length ; a++) {
          int temp = nums[i];
          nums[i] = nums [j];
          nums[j] = temp;

        }


    }
    public static void reverse(int i , int nums[] , int n) {
        if (i>=n/2) return;
        swap(nums , i , n-i-1);
        reverse(i+1 , nums , n);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int nums [] = new int [n];
        for (int i=0; i<n ; i++) {
            nums[i] = s.nextInt();

        }
        s.close();
    reverse(0, nums, n);
    for (int i =0; i<n ; i++) {
        System.out.print(nums[i] + " ");
    }
    }
}
