class demo {
    int a , b;
    //constructor 
    demo(int i , int j) {
        a=i;
        b=j;
    }
    //method
    boolean isEqual(demo e) {
        return (e.a == a && e.b == b);

    }


}

public class objects {
    public static void main(String[] args) {
        demo obj1 = new demo(100 ,22);
        demo obj2 = new demo (100,22);
        demo obj3 = new demo (-1 , 5);
        System.out.println("obj1==obj2 :" + obj1.isEqual(obj2));
        System.out.println("obj1==obj2 :" + obj1.isEqual(obj3));

    }
}
