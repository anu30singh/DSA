class shapes {
    int side1;
    int side2;
    void getside(int s1 , int s2) {
        side1= s1;
        side2 = s2;

    }
    void display() {
        System.out.println(side1);
        System.out.println(side2);
    }
}
public class classes {
    public static void main(String[] args) {
        System.out.println("Anushka Singh IT-C ");
        shapes rectangle = new shapes();
        rectangle.getside(2, 3);
        System.out.println("sides of rectangle :");
        rectangle.display();
        shapes square = new shapes();
        square.getside(2, 2);
        System.out.println("sides of square ");
        square.display();
    }
}
