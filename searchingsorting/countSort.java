import java.util.Arrays;

public class countSort {
    public static void countsort(int [] array) {
        if(array.length<=1 || array== null) {
            return;

        }
        int max = array[0];
        for(int num : array) {
            if(num>max) max = num;
        }
        int frqArray [] = new int [max+1];
        for(int i : array) {
            frqArray[i]++;
        }
        int index =0;
        for(int i=0; i<=max ; i++) {
            while(frqArray[i]>0) {
                array[index]= i;
                index++;
                frqArray[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4,4,1,2,3,9,8,6};
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}