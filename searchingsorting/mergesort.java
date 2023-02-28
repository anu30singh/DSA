

public class MergeSort {
    public static void merge (int s1[], int s2[], int d[] ) {
       int i = 0;
       int j = 0;
       int k= 0; 
        
        //s1 - array1 s2- arry2 d- combined
while ( i <s1.length && j <s2.length) {
if (s1[i] <= s2[j]) {
    d[k] = s1[i];
    i++;
    k++;
} else {
    d[k] = s2[j];
    k++;
    j++;
}
if (i<s1.length) {
    while (i<s1.length ) {
        d[k] = s1[i];
        k++;
        i++;
    } 
} if (j<s2.length) {
    while (j< s2.length) {
        d[k] = s2[j] ;
        k++;
        j++;
    }
}
}
    }
    public static void mergeSort(int a[]) {
        if (a.length<=1) { //base case
            return ;
        }
        int b[] = new int[a.length/2];
        int c[] = new int [a.length- b.length];
        for (int i=0; i<a.length/2 ; i++) {
            b[i] = a[i] ;
        }
        for (int i = a.length/2; i<a.length; i++) {
            c[i- a.length/2] = a[i];
        }

        mergeSort(b);
        mergeSort(c); //ab induction hypothesis se dono arrays sort hojaygey
        //ab bss do sorted arrays ko merge karna toh merge karne ke liye ek function banygey
        merge(b , c, a);
    
    } 

    public static void main(String [] args) {
       
        int a[] = { 6, 4 , 10 , 17 , 7 , 9 };
        mergeSort(a);
        for (int i= 0; i< a.length; i++) {

            System.out.println(a[i]);
            
        }
    }
}
