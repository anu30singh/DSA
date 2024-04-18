public class StringBasic {
    //remove occurance of 'a' from a string
    public static void main(String[] args) {
        skip("", "bbbhahahajhhajahajaha");
    }

    public static void skip(String p , String up) {
        if(p.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch== 'a') {
            skip (p, up.substring(1));
        } else {
            skip(p+ ch , up.substring(1));
        }
    }
}
