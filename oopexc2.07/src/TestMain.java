public class TestMain {
    public static void main(String[] args){
        MyLine m1 = new MyLine(6, 8, 5 ,3);
        System.out.println(m1);
        m1.setBeginX(32);
        m1.setBeginY(65);
        m1.setEndX(12);
        m1.setEndY(89);
        System.out.println(m1);
        System.out.println("x1: " + m1.getBeginX());
        System.out.println("y1: " + m1.getBeginY());
        System.out.println("x2: " + m1.getEndX());
        System.out.println("y2: " + m1.getEndY());
        m1.setBeginXY(43, 88);
        System.out.println("x1: " + m1.getBeginXY()[0]);
        System.out.println("y1: " + m1.getBeginXY()[1]);
        System.out.println("x2; " + m1.getEndXY()[0]);
        System.out.println("y2: " + m1.getEndXY()[1]);
        System.out.printf("%.2f%n", m1.getLength());
        System.out.println(m1);
        System.out.printf("%.2f%n", m1.getGradient());

    }
}
