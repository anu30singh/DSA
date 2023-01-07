import java.util.Scanner;
// public class Runner {

// 	public static void main(String[] args) {
// 		int i,j;
//         Scanner s= new Scanner(System.in);
//         int n = s.nextInt();
        
//         for (i=1;i<=n;i++) {
//             for (j=n;j>=1;j--){
//                 if(j!=i)
//                     System.out.println(j);
//                  else 
//                     System.out.println("*");
                
//             }
//             System.out.println("");
//         }
       
        

// 	}
// }
public class Runner{  
    public static void main(String []args){  
           int i,j;
           Scanner s= new Scanner(System.in);
                  int n = s.nextInt();
      for(i=1;i<=n;i++){// this loop is used to print the lines  
         for(j=n;j>=1;j--){// this loop is used to print numbers in a line  
             if(j!=i)  
              System.out.print(j);  
              else  
               System.out.print("*");  
      }   
      System.out.println("");  
      }  
       }  
  }  
