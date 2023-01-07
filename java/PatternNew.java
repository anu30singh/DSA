import java.util.Scanner;

public class PatternNew {
    public static void main (String [] args) {
        Scanner s= new Scanner (System.in);
        int n= s.nextInt();
int i= 1;
while (i<=n) {
    char p= (char)('A' + i-1);
    int j=1;
    while (j<=n) {
        System.out.println(p);
        p= (char)(p+1);
        j++;
    }
    System.out.println ();
    i++;
}

    }
}
// import java.util.Scanner;
// public class PatternNew {  

//     public static void bubbleSort(int arr [] , int size){
//     	 for (int step = 0; step < size - 1; ++step) {
//  for (int i = 0; i < size - step - 1; ++i) {
//  // To sort in descending order, change > to < in this line.
//  if (arr[i] > arr[i + 1]) {
//  // swap if greater is at the rear position
//  int temp = arr[i];
//  arr[i] = arr[i + 1];
//  arr[i + 1] = temp;
//  }
//  }
//  }

//     } 
//     public static void main(String[] args) {
//         Scanner s= new Scanner(System.in);
//         int t= s.nextInt();
//         int N = s.nextInt();
        
// int arr[] = new int[N];
        
// bubbleSort(input, N);
// for(int i = 0; i < N; i++) {
// System.out.println(input[i]);
// }

// }
// }