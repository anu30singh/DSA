public class recursionBasics {
    public static void main(String[] args) {
        int arr[] = {4,5,6,8,9,15};
       System.out.println(sorted(arr, 0)); 
    }

    public static boolean sorted (int arr [] , int ind) {
        //basecase 
        if (ind == arr.length-1) return true;
        
        return arr[ind]<arr[ind+1] && sorted(arr , ind+1);
    }
}
