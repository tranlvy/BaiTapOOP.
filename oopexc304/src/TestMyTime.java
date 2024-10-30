public class TestMyTime {
    public static void main(String[] args){
        MyTime t1= new MyTime(1, 2, 3);
        System.out.println(t1);
        System.out.println();

        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);
        System.out.println( " Hour: " + t1.getHour() );
        System.out.println( " Minute: " + t1.getMinute() );
        System.out.println( " Second: " + t1.getSecond() );
        System.out.println();

        t1.setTime(23,59,58);
        System.out.println(t1);
        System.out.println(t1.nextHour() );
        System.out.println(t1.nextMinute() );
        System.out.println(t1.nextSecond() );
        System.out.println();

        System.out.println(t1.previousHour() );
        System.out.println(t1.previousMinute() );
        System.out.println(t1.previousSecond() );


        MyTime t2 = new MyTime( 24,60,60);
        System.out.println(t2);

    }
}
