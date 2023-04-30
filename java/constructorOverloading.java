class box {
    double width , height , depth;
    box(double w , double h , double d) {
        width = w;
        height = h;
        depth = d;
    }
    box() {
        width = height = depth =0;

    }
    box (double length ) {
        width = height = depth = length;

    }
    double volume() {
        return width*height*depth;
    }
}


public class constructorOverloading {
    public static void main(String[] args) {
        box mybox = new box(10,20,15);
        box mybox2 = new box();
        box mycube = new box(7);
        double vol ;
        System.out.println("Anushka Singh IT-C");
        vol = mybox.volume();
        System.out.println("volumn of my box :" + vol);
        vol = mybox2.volume();
        System.out.println("volumn of my box2 :" + vol);
        vol = mycube.volume();
        System.out.println("volumn of my cube :" + vol);
    }
}
