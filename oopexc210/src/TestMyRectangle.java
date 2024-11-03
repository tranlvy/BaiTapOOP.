public class TestMyRectangle {
    public static void main(String[] args){
        MyPoint p1= new MyPoint();
        System.out.println(p1);

        p1.setX(8);
        p1.setY(6);
        System.out.println( "x is: " + p1.getX());
        System.out.println( "y is: " + p1.getY());

        p1.setXY(3, 0);
        System.out.println( p1.getXY()[0]);
        System.out.println( p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2= new MyPoint(0, 4);
        System.out.println(p2);

        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance());
        System.out.println();

        MyRectangle r1 = new MyRectangle(p1,p2);
        System.out.println(r1);
        System.out.println( " Area 1: " + r1.getArea());
        System.out.println( " Perimeter 1: " + r1.getPerimeter());
        System.out.println( " TopLeft x1=" + r1.getTopLeftX());
        System.out.println( " TopLeft y1=" + r1.getTopLeftY());
        System.out.println( " BottomRight x2=" + r1.getBottomRightX());
        System.out.println( " BottomRight y2=" + r1.getBottomRightY());
        System.out.println( " TopLeft: (" + r1.getTopLeftXY()[0] + "," + r1.getTopLeftXY()[1] + ")");
        System.out.println( " BottomRight: (" + r1.getBottomRightXY()[0] + "," + r1.getBottomRightXY()[1] + ")");
        System.out.println();

        r1.setTopLeftXY(3,7);
        r1.setBottomRightXY(5,9);
        System.out.println(r1);
        System.out.println( " Area 2: " + r1.getArea());
        System.out.println( " Perimeter 2: " + r1.getPerimeter());
        System.out.println( " TopLeft x1=" + r1.getTopLeftX());
        System.out.println( " TopLeft y1=" + r1.getTopLeftY());
        System.out.println( " BottomRight x2=" + r1.getBottomRightX());
        System.out.println( " BottomRight y2=" + r1.getBottomRightY());

    }
}
