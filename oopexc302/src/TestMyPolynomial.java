public class TestMyPolynomial {
    public static void main(String[] args){
        MyPolynomial p1 = new MyPolynomial( 1.1, 2.2, 3.3 );
        MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println( " Degree of p1: " + p1.getDegree() );
        System.out.println( " Degree of p2: " + p2.getDegree() );
        System.out.println();

        System.out.println(p1);
        System.out.println( " p1(5)=" + p1.evaluate(5) );
        System.out.println( " p1+p2=" + p1.add(p2) );
        System.out.println( " p1*p2=" + p1.multiply(p2) );
        System.out.println();

        System.out.println(p2);
        System.out.println( " p2(5)=" + p2.evaluate(5) );
        System.out.println( " p1+p2=" + p2.add(p1) );
        System.out.println( " p1*p2=" + p2.multiply(p1) );

    }
}
