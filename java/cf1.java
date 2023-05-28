import java.util.*;
public class cf1 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        while (t-->0) {
            String str = s.nextLine();
            String str1 = "codeforces";
            int count =0;
            for(int i=0; i<str.length() ; i++) {
                if(str.charAt(i)!= str1.charAt(i)) count++;
            }
            
            System.out.println(count);
            

        }
       
        
    }
}
