public class TestMain {
    public static void main(String[] args) {
        Ball ball = new Ball(2.0f, 5.6f, 8.1f);
        System.out.println(ball);
        System.out.println( " x: " + ball.getX());
        System.out.println( " y: " + ball.getY());
        System.out.println( " z: " + ball.getZ());
        ball.setXYZ(1.3f,4.5f,6.9f);
        System.out.println(ball);

        Player player = new Player(1, 0, 0);
        player.move(4.5f, 3.2f);
        if ( player.near(ball)){
            player.kick(ball);
            System.out.println(ball);
        }




    }
}
