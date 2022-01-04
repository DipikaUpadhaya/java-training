package day5;

public class Hierarchical {

    public static void main(String[] args) {
        Square s1= new Square();
        s1.setLength(1.2f);
        s1.areaSquare(s1.getLength());



        Rectangle s2= new Rectangle();
        s2.setLength(2);
        s2.setBreadth(3);
        s2.areaRectangle(s2.getLength(), s2.getBreadth());


    }
}
