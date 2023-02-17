package insertarrylist;

import java.util.ArrayList;

public class insertelement {
    public static void main(String[] args) {
        ArrayList<String>Shape=new ArrayList<>();
        Shape.add("rectangle");
        Shape.add("square");
        Shape.add("circle");
        Shape.add("triangle");
        Shape.add("cylinder");
        System.out.println(Shape);
        Shape.add(0,"cube");
        System.out.println(Shape);
    }
}
