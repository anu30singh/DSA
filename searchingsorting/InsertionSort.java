public class InsertionSort {
    public static void printarr( int arr[]) {
        int n = arr.length;
        for(int i =0; i<n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void isort (int arr[]) {
        
        for(int i=0; i <arr.length ; i++) {
            //to be inserted at ith position
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            //position will j+1
            arr[j+1] = temp;
        }
    }
    public static void main(String args[]) {
        int arr [] = {1, 5, 7 ,9, 6 , 8,11, 10};
        isort(arr);
        printarr(arr);
    }
}
