//package SEARCHINGSORTING;
public class selectionSort {
    public static void printarr( int arr[]) {
        int n = arr.length;
        for(int i =0; i<n ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int  [] selectionSorting(int arr[]) {
        for (int i=0; i<arr.length ; i++) {
            int mini = arr[i];
            int minindex= i;
            for (int j=i ; j<arr.length ; j++ ) {
                if (mini < arr[j]) {
                    mini = arr[j];
                    minindex= j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minindex];
            arr[minindex]= temp;
        }
        return arr;

    }
    public static void main (String [] args) {
        int arr[] = {1, 7, 9 , 12 , 17, 16};
        selectionSorting(arr);
      printarr(arr);
    
    }
}
