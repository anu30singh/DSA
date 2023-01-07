import java.util.Scanner;
public class nCr {
   //  public static void main (String[] args) {
    //     String a="coding",b="ninjas";
    //     if(a.contains("ing"))
    //     {
    //         a+=b;
    //     }
    //     else
    //     {
    //         b+="ing";
    //     }
    //     System.out.print(b+a);
    //     }
 //   String a="coding";
//for(int i=2;i<4;i++)
// {
//     System.out.print(a.substring(i));
// }
//      }
//     }

public static void main (String[]args) {
    Scanner s= new Scanner(System.in);
    int n= s.nextInt();
    int r=s.nextInt();
    int factN=1;
    for (int i=1;i<=n;i++) {
        factN=factN*i;
    }
    int factR=1;
    for (int i=1; i<=r;i++){
        factR=factR*i;
    }
    int factNR=1;
    for (int i=1;i<=n-r;i++) {
        factNR=factNR*i;
    }
    int result=factN/(factR*factNR);
    System.out.println(result);
} 
}

//  public class nCr{
//     public static void main(String[] args){
//     int[] A = numbers();
//     }
    
//     public static int[] numbers(){
//     int[] A = new int[3];
//     A[0] = 2;
//     A[1] = 3;
//     A[2] = 4;
//     return A;
//     }
//     }