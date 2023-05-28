import java.util.Scanner;

public class cf2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-->0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int c=0;
            int ans =0;
            for(int i=0; i<n ; i++) {
                arr[i] = s.nextInt();
                if(arr[i]==0) {
                    c++;
            } else {
                 ans =Math.max(c,ans);
                 c=0;
            }

        }
        ans = Math.max(c,ans);
        System.out.println(ans);
    }
}
}
