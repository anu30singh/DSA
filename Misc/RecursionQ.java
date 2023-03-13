import java.util.Scanner;
public class RecursionQ {
// remove X
	// Return the changed string
	public static String removeX(String input){
		if (input.length()==0) {
            return "";
        } 
        String smallOutput = removeX(input.substring(1));
        
        if (input.charAt(0)=='x') {
   
            return input.replace("x" , "") ;
        } else {
            return input.charAt(0) + smallOutput;
        }

	} 
    public static int count (int n) {  ///count no. of digits
        if (n==0) {
            return 0;
        } 
        int smallans = count(n/10);
        return smallans+1;
    }
    public static boolean isSorted (int arr[]) {   //is array sorted or not
        if (arr.length ==1) {
            return true;
        }
        if (arr[0] > arr[1]) {
            return false;
        }
        int smallArray [] = new int[arr.length-1];
        for (int i=1; i< arr.length ; i++) {
             arr[i] = smallArray [i-1];
        }
        boolean isSmallarraySorted = isSorted(smallArray);
        return isSmallarraySorted;
    }
    public static boolean isSortedbetter (int arr[], int si) {   //is array sorted or not
        if (si == arr.length-1) {
            return true;
        }
        if (arr[si] > arr[si+1]) {
            return false;
        }
        
        boolean isSmallarraySorted = isSortedbetter(arr, si +1);
        return isSmallarraySorted;
        }
    
    
    public static void main (String[] args) {
        // Scanner s = new Scanner (System.in);
        // String A= s.nextLine();
        // int n = s.nextInt();
        // System.out.println (removeX(A));
        // System.out.println (count(n));
        int a[] = {10, 4, 7};
        int b [] ={1,2,3,4,5,6};
        System.out.println(isSortedbetter(a,0));
        System.out.println(isSortedbetter(b,0));

    }
}
