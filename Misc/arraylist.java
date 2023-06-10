import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static ArrayList<Integer> removeDuplicate( int arr[]) {

        ArrayList<Integer> result = new ArrayList<>();
result.add(arr[0]);
for (int i = 1; i<arr.length; i++) {
if (arr[i] != arr[i-1]) {
    result.add(arr[i]);
}
}
return result;
    }

    public static void main (String [] args) {
    //     ArrayList<String> list = new ArrayList<>();
    //     list.add("ababaaab");
    //     list.add("abba");
    //     list.add("ababaaab");





    //You have a boutique that specializes in words that don't have adjacent matching characters. Bobby , a competitor , has decided to get out of the word business altogether and you have bought his inventory . Your idea is to modify his inventory of words so they are suitable for sale in your store. To do this , you find all adjacent pairs of matching characters and replace one of the character with a different one. determine the minimum number of characters that must be replaced to make a saleable word.

// For example : you purchased words = [add , boook , break]
// output : [1,1, 0]

// words = [ab , aab , abb , abab , abaaaba]
// output : 0 1 1 0 1
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
        int c=0;
        int i=0;
        int j=0;
        int length=0;
        int ans =0;
        sc.close();
        while(j<s.length()) {
                       if(s.charAt(i)==s.charAt(j)) j++;
                         else {
                            length= (j-i); 
                            ans+=(length)/2;
                            i=j;
                     }
                    }
                   length= (j-i);  //right edge case
                   ans+=length/2;
                   System.out.println(ans);
    //   for(String s: list) {
    //         while(j<s.length()) {
    //             if(s.charAt(i)==s.charAt(j)) j++;
    //             else length= (j-i); ans+=(length)/2; i=j;
    //         }
    //         length= (j-i);
    //         ans+=length/2;
    //             }
    //         ArrayList<Integer> ansf = new ArrayList<> ();
    //        ansf.add(ans);
    //          Integer arr[] = new Integer[ansf.size()];
    //          arr = ansf.toArray(arr);
    //        for(Integer x : arr) {
    //            System.out.println(x + " ");

    //    }
            

        }
    }

        // int Arr[] ={10,10,10, 20, 20, 30, 40};
        // ArrayList<Integer> result = removeDuplicate(Arr);
        // for(int i=0;i<result.size();i++){
        //     System.out.println(result.get(i));
        //   }
    

