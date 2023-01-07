public class printAllPairs {
//arrays ka print all pairs wala question
public static void PrintAllPairs(int arr[]){
    int n = arr.length;
for(int i=0; i<n-1;i++) {
for (int j=i+1; j<n;j++) {
System.out.println("("+arr[i]+ "," + arr[j]+")");
}
}
}


    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
PrintAllPairs(arr);
    }
}