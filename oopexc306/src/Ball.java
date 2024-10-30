public class Ball {
    private float x, y, xDelta, yDelta;
    private int radius;
    public Ball(float x, float y, int radius, int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        if (direction>-180 && direction<=180){
            double radians= Math.toRadians(direction);
            xDelta =(float) (speed*Math.cos(radians));
            yDelta =(float) (speed*Math.sin(radians));
        }
    }
    public float getX(){
        return x;
    }
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    }
    public void setY(float y){
        this.y=y;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public float getXDelta(){
        return xDelta;
    }
    public void setXDelta(float xDelta){
        this.xDelta=xDelta;
    }
    public float getYDelta(){
        return yDelta;
    }
    public void setYDelta(float yDelta){
        this.yDelta=yDelta;
    }
    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }
    public void reflectHorizontal(){
        this.xDelta=-xDelta;
    }
    public void reflectVertical(){
        this.yDelta=-yDelta;
    }
    public String toString(){
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")";
    }
}
