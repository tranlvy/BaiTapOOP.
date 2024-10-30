public class Player {
    private int number;
    private float x, y, z;
    public Player(int number, float x, float y) {
        this.number=number;
        this.x=x;
        this.y=y;
        z=0.0f;
    }
    public void move(float xDisp, float yDisp){
        this.x+=xDisp;
        this.y=yDisp;
    }
    public void jump(float xDisp){
        this.z+=xDisp;
    }
    public boolean near(Ball ball){
        float xDelta=ball.getX()-this.x;
        float yDelta=ball.getY()-this.y;
        float zDelta=ball.getZ()-this.z;
        return (Math.sqrt(xDelta*xDelta + yDelta*yDelta + zDelta*zDelta))<8;
    }
    public void kick(Ball ball){
        float xDelta=ball.getX()-this.x;
        float yDelta=ball.getY()-this.y;
        float zDelta=ball.getZ()-this.z;

        float distance=(float)Math.sqrt(xDelta*xDelta + yDelta*yDelta + zDelta*zDelta);

        if (distance<8){
            float kickDistance = 3.0f;// Giả sử bóng sẽ di chuyển một khoảng cách bằng 3 đơn vị trong hướng của Player
            float newX =( xDelta * (kickDistance / distance)) + ball.getX();
            float newY =( yDelta * (kickDistance / distance)) + ball.getY();
            float newZ =( zDelta * (kickDistance / distance)) + ball.getZ();
            ball.setXYZ( newX, newY, newZ );

        }
    }
}
