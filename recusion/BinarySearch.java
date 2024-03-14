public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,5,5,7,8,9,11};
        int target = 11;
    }
    static int search(int arr[] , int target, int s , int e) {
        if(s>e) return -1;
        int mid = (s+e)/2;
        if(arr[mid]== target) return mid;
        
        if(arr[mid]> target) {
           return search(arr , target , s , mid-1 );
        }
        return search(arr, target , mid+1 , e);
    }
}
