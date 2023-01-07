public class bubbleSort {
    public static void printarr( int arr[]) {
        int n = arr.length;
        for(int i =0; i<n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] bSort (int arr[]) {
        for (int i=0; i<arr.length-1 ; i++) {
            for (int j=0; j<arr.length-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        return arr;
    }
    public static void main (String [] args) {
        int anu [] = {12, 1 , 5 , 6 , 9 , 4};
        bSort(anu);
        printarr(anu);
    }
}
