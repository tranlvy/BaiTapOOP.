public class TestMyDate {
   public static void main(String[] args){
       MyDate d1 = new MyDate(2012,2,28);
       System.out.println(d1);
       System.out.println(d1.nextDay());
       System.out.println(d1.nextDay());
       System.out.println(d1.nextMonth());
       System.out.println(d1.nextYear());
       System.out.println();

       MyDate d2 = new MyDate(2012, 1, 2);
       System.out.println(d2);
       System.out.println(d2.previousDay());
       System.out.println(d2.previousDay());
       System.out.println(d2.previousMonth());
       System.out.println(d2.previousYear());
       System.out.println();

       MyDate d3 = new MyDate(2012, 2, 29);
       System.out.println(d3.previousYear());
       System.out.println();

//       MyDate d4 = new MyDate(2099,11,31);
//       System.out.println(d4);
//       MyDate d5 = new MyDate(2011, 2, 29);
//       System.out.println(d5);
       MyDate d6 = new MyDate(2011, 12,28);
       for ( int i=0; i<66 ; i++){
           System.out.println(d6);
           d6.nextDay();
       }
   }
}
