public class mergesort {
    public static int [] mergeS (int [] input) {
        if (input.length <= 1) return input;
        int mid = input.length / 2;
        int part1 [] = new int[mid];
        int part2 [] = new int [input.length - mid];
        for (int i=0; i< mid ; i++) {
            part1[i] = input [i];
        }
        int k=0;
        for(int i = mid ; i<input.length ; i++) {
            part2[k] = input[i];
            k++;
        }
        mergeS(part1);
        mergeS(part2);
        merge (part1, part2 , input);
        return input;
    }
    public static void merge (int [] a , int [] b , int[] output) {
        int i=0 , j=0 , k=0;
        while (i<a.length && j < b.length) {
            if (a[i] < b[j]) {
                output[k] = a[i];
                k++;
                i++;
            } else {
                output[k] = b[j];
                j++;
                k++;

            }
        } 
        while (i< a.length) {
            output[k]= a[i];
            k++;
            i++;
        }
        while (j< b.length){
            output [k] = b[j];
            j++;
            k++;

        }
    }
    
        

}
