// There are 22 trains AA and BB and NN stations in a line from 11 to NN in order. There is also an array PP of length N-1N−1 such that P_iP 
// i
// ​
//   (1\le i \lt N)(1≤i<N) denotes the amount of time any train takes to go from the ii-th station to the (i+1)(i+1)-th station.

// Initially, both trains are at station 11. Train AA departs from station 11 and stops directly at station NN. For safety purposes, it is maintained that train BB cannot depart from station ii unless train AA has already reached station (i+1)(i+1) (1 \le i \lt N)(1≤i<N).

// Find the minimum time after which train BB reaches station NN, once train AA departs from station 11.

import java.util.Scanner;

public class TwoTrain {
    public static void main (String[] args) throws java.lang.Exception
	{
	    	Scanner s=new Scanner (System.in);
		int t=s.nextInt();
		while(t!=0){
		    int n=s.nextInt();
		    int sum=0; 
		    int d=0;
		    int[] a=new int[n];
		    int[] b=new int[n];
		    
		    for(int i=1;i<n;i++){
		        a[i]=s.nextInt();
		        sum+=a[i];
		        b[i]=a[i];
		        a[i]=sum;
		        
		    }
		    for(int i =0;i<n-1;i++){
		        d=a[i+1]-b[i];
		        if(d>0){
		            b[i+1] =  b[i] + d +b[i+1];
		        }
		        else {
		            b[i+1]=b[i]+b[i+1];
		            
		        }
		    }
		    
		    System.out.println(b[n-1]);
		    t--;
		}
		// your code goes here
	}
}
