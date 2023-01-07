//import java.util.Scanner;
//public class apnaKaam { 

    // public static void printChars(String str) {  // function for printing all chars in a string
    //     for (int i=0; i<str.length() ; i++) {
    //         System.out.println(str.charAt(i));
    //     }
    // }
   // public static void main (String[] args) { 
// Scanner s= new Scanner(System.in);
// String str= s.nextLine();
// printChars(str);
// ye char print karne wala question h
        // Scanner s=new Scanner(System.in);     
        // String str1=s.next();
        // String str2=s.nextLine();
        // String str3=str2+str1;
        // System.out.println(str3);
        //oper output question h
     //   }
    
//}

// import java.util.Scanner;
// public class apnaKaam {
    
//     public static void main(String[] args) {
//         Scanner s= new Scanner(System.in);
//         int n = s.nextInt();
//          int i=2;
//         while (i<=n){
           
//             if (n%i==0){
//                 System.out.println(i+" ");
                
//             }  
//                   i+=1;
            
          
//         }
        
//     }
// }

// import java.util.*;

// public class apnaKaam {
//     public static void main (String[] args) 
// 	{
// 		int N, i, sum = 0;
 
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter a number");
//         N = s.nextInt();
 
//         for(i = 0; i <= N; i++){
//             if((i%2) == 1){
//                 sum += i;
//             }
//         }
//         System.out.print(sum);
// }
// }


//    public static void displayBoard(int[][] chess) {
//         for (int i = 0; i < chess.length; i++) {
//             for (int j = 0; j < chess[0].length; j++) {
//                 System.out.print(chess[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println();
//     }

//     static int[][] dir = { {-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}, {-2,-1} };
    
//     public static void printKnightsT





//flipkart Question
// There are N children standing in a line. Each child is assigned a rating value.

// You are giving candies to these children subjected to the following requirements:

// 1. Each child must have at least one candy.
// 2. Children with a higher rating get more candies than their neighbors.
// What is the minimum candies you must give?

// Input Format:

// The first and the only argument contains N integers in an array A.
// Output Format:

// Return an integer, representing the minimum candies to be given.
// Example:

// Input 1:
//     A = [1, 2]

// Output 1:
//     3

import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class apnaKaam
{

	public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
	    int t = s.nextInt();
	    while (t-->0) {
	        int n = s.nextInt();
	        int x = s.nextInt();
	       
	       if ((n*x) % 2!=0) {
	            System.out.println(((x * n )/4) +1);
	       } else {
	           System.out.println((x * n )/4);
	       }
	       
	    }

        // Scanner s = new Scanner (System.in); //codechef
		// int t = s.nextInt();
		// while (t--> 0) {
		//     float a = s.nextInt();
		//     float b = s.nextInt();
		//     float x = s.nextInt();
		//     float y = s.nextInt();
		//     double t1= a/x;
		//     double t2= b/y;
		//     if (t1>t2) {
		//     System.out.println("Chefina");}
		//     if (t1==t2) { 
		// System.out.println("Both");}
		// if (t1<t2) {
		// System.out.println("chef");}
		// } 
    }
}
    //     Scanner s = new Scanner(System.in);
    //     int q = s.nextInt();
    //     while (q!=0) {
    //         int a = s.nextInt();
    //         int b = s.nextInt();
    //         int n = s.nextInt();
            
    //         int sum = a;
                
    //         for (int i=0; i<n ; i++) {
    //             sum+= b*Math.pow(2,i);
                
    //             System.out.print(sum + " ");
    //         } 
	// 		System.out.println();
    //         --q;
    //     }
    // }
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 	    try {
// 		Scanner s= new Scanner (System.in);
// 		int T=s.nextInt();
// 		for(int i=0; i<=T;i++) {
// 		    int N= s.nextInt(); 
// 		    int X= s.nextInt(); 
// 		    int Y=s.nextInt();
// 		    int A = s.nextInt();
// 		    int B= s.nextInt();
// 		    s.nextLine();
		    
// 		    float pCost= N*X/A;
// 		    float dCost= N*Y/B;
// 		    if (pCost>dCost) {
// 		        System.out.println("Diesel");
// 		    } else if (pCost<dCost) {
// 		        System.out.println("Petrol");
// 		    } else if (pCost==dCost) {
// 		        System.out.println("Any");
// 		    }
// 		}
// 	} catch (Exception e) {
// 	    return;
// 	}
// }

// import java.util.*;
// import java.lang.*;
// import java.io.*;
// import java.lang.Math;

// /* Name of the class has to be "Main" only if the class is public. */
// class apnaKaam
// {
//     public static int [] takeInput() {
//         	Scanner s = new Scanner(System.in);
	
// 	int N= s.nextInt();
// 	int [] Arr = new int [N];
// 	for (int i =0; i<N;i++) {
// 	    Arr[i]= s.nextInt();
// 	}
// 	return Arr;
//     }
// public static int frequentNum (int arr[]) {
//     for (int i=0; i < arr.length ; ++i) {
//         for (int j=i+1;j<arr.length;++j){
//             if( arr[i]==arr[j] ) {
//                 return arr[i];
//             }
//         }
//     }
//     return max( arr [i]);
// }

// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 	    Scanner s= new Scanner(System.in);
// 	    int T= s.nextInt();
// 	    for (int j=0; j<=T; j++) {
// 	 int A[]= takeInput();
// 	int ans=frequentNum(A);
// 	 System.out.println(ans);
// }
// 	}

// }
