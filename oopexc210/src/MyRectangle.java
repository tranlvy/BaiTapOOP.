public class MyRectangle {
    private MyPoint topLeft, bottomRight;

    public MyRectangle(int x1, int y1, int x2, int y2){
        topLeft = new MyPoint(x1,y1);
        bottomRight = new MyPoint(x2,y2);
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public MyPoint getTopLeft(){
        return topLeft;
    }

    public MyPoint getBottomRight(){
        return bottomRight;
    }

    public int getTopLeftX(){
        return topLeft.getX();
    }

    public int getTopLeftY(){
        return topLeft.getY();
    }

    public int getBottomRightX(){
        return bottomRight.getX();
    }

    public int getBottomRightY(){
        return bottomRight.getY();
    }

    public int[] getTopLeftXY(){
        return new int[]{topLeft.getX(), topLeft.getY()};
    }

    public void setTopLeftXY(int x, int y){

        this.topLeft.setXY(x,y);
    }

    public int[] getBottomRightXY(){
        return new int[]{bottomRight.getX(), bottomRight.getY()};
    }

    public void setBottomRightXY(int x, int y){
        this.bottomRight.setXY(x,y);
    }

    public String toString(){
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public double getPerimeter(){
        int height = Math.abs(topLeft.getY()-bottomRight.getY());
        int width = Math.abs(topLeft.getX()-bottomRight.getX());
        return (height + width)*2;
    }

    public double getArea(){
        int height = Math.abs(topLeft.getY()-bottomRight.getY());
        int width = Math.abs(topLeft.getX()-bottomRight.getX());
        return height*width;
    }

}
