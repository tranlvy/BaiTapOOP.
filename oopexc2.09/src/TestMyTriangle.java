public class TestMyTriangle {
    public static void main(String[] args){
        MyPoint p1 = new MyPoint();
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

        MyPoint p3= new MyPoint(6,9);

        MyTriangle tr1= new MyTriangle( 1,2,2,1,2,0);
        System.out.println( tr1);
        System.out.println( " Perimeter: " + tr1.getPerimeter());
        System.out.println(tr1.getType());

        MyTriangle tr2= new MyTriangle( p1, p2, p3);
        System.out.println( tr2);
        System.out.println( " Perimeter: " + tr2.getPerimeter());
        System.out.println(tr2.getType());

    }

}
