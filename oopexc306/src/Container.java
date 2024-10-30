public class Container {
    private int x1,y1,x2,y2;
    public Container(int x, int y, int width, int height){
        // X va Y dua vao la goc trai tren
        x1 = x;
        y1= y;
        // tu x1 va y1 tinh x2 va y2 bang chieu dai va chieu
        x2=x1+width-1;
        y2=y1+height-1;
    }
    public int getX(){
        return x1 ;
    }
    public int getY(){
        return y1;
    }
    public int getWidth(){
        return x2-x1+1;
    }
    public int getHeight(){
        return y2-y1+1;
    }
    public boolean collides(Ball ball){
        boolean collision = false ;
        if ( (ball.getX() - ball.getRadius() <=this.x1) || (ball.getX() + ball.getRadius() >=this.x2)){
            ball.reflectHorizontal();
            collision=true;
        }
        if ( (ball.getY() - ball.getRadius()<=this.y1) || (ball.getY() + ball.getRadius() >= this.y2)){
            ball.reflectVertical();
            collision=true;
        }
        return collision;
    }
}
