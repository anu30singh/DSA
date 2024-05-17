import java.util.ArrayList;
public class  subSetBasics {
    public static void main(String[] args) {
        //creating subsets from a given string
        //returning an arraylist as ans we will create a new function to print the arraylist
        Create("", "abc");
       System.out.println(subSeqList("", "abc")); 
    }

    public static void Create (String p , String up) {
        if(up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        Create(p+ch , up.substring(1));
        Create(p , up.substring(1));
    }

    public static ArrayList<String> subSeqList (String p , String up) {
        if(up.isEmpty()) {
            ArrayList<String> ansList = new ArrayList<>();
            ansList.add(p);
            return ansList;

        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqList(p + ch, up.substring(1));
        ArrayList<String> right = subSeqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
