public class TestMain {
    public static void main(String[] args){
        Ball b1 = new Ball (30, 30, 6, 10, 15);
        System.out.println(b1);
        b1.setX(45);
        b1.setY(55);
        System.out.println( "x: " + b1.getX() );
        System.out.println( "y: " + b1.getY() );
        b1.setRadius(34);
        System.out.println( "radius: " + b1.getRadius());
        System.out.println( "xDelta: " + b1.getXDelta());
        System.out.println( "yDelta: " + b1.getYDelta());
        b1.setXDelta(22);
        b1.setYDelta(25);
        System.out.println(b1);
        b1.move();
        System.out.println(b1);
        b1.reflectHorizontal();
        System.out.println(b1);
        b1.reflectVertical();
        System.out.println(b1);




        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for( int step = 0; step < 100; step++){
            ball.move();
            box.collides(ball);
            System.out.println(ball);
        }
    }
}
