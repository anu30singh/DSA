public class binarySearch {
    public static int bsearch ( int arr[] , int x) {
        int s = 0;
        int e= arr.length;
        
        while (s<=e) {
           int mid = (s+e)/2;
            if (arr[mid]<x) {
                s= mid +1;
            }
            else if (arr[mid] > x) {
                e = mid-1;
            }
            else {
                return mid;
            }

        }
        return -1;

    }
    public static void main(String [] args) {
        int arr[] = {1, 2, 5 , 8 , 9, 14 ,16};
      int ans = bsearch(arr, 14);
      System.out.println(ans);

    }
}
