public class MyComplexApp {
    public static void main(String[] args){
        MyComplex num1 = new MyComplex( 1.1, 2.2);
        MyComplex num2 = new MyComplex( 3.3, 4.4);
        System.out.println( " Number 1 is: (" + num1 + ")");
        boolean result1 = num1.isReal();
        if ( result1 ){
            System.out.println( " (" + num1 + ") is a pure real number ");
        }
        else{
            System.out.println( " (" + num1 + ") is NOT a pure real number ");
        }
        result1 = num1.isImaginary();
        if ( result1 ){
            System.out.println( " (" + num1 + ") is a pure imaginary number ");
        }
        else{
            System.out.println( " (" + num1 + ") is NOT a pure imaginary number ");
        }
        System.out.println();

        System.out.println( " Number 2 is: (" + num2 + ")" );
        boolean result2 = num2.isReal();
        if ( result2 ) {
            System.out.println( " (" + num2 + ") is a pure real number " );
        }
        else{
            System.out.println( " (" + num2 + ") is NOT a pure real number " );
        }
        result2 = num2.isImaginary();
        if ( result2 ) {
            System.out.println( " (" + num2 + ") is a pure imaginary number " );
        }
        else{
            System.out.println( " (" + num2 + ") is NOT a pure imaginary number " );
        }
        System.out.println();

        boolean result3= num1.equals( num2 );
        if ( result3 ){
            System.out.println( " (" + num1 + ") is equal to (" + num2 + ")" );
        }
        else{
            System.out.println( " (" + num1 + ") is NOT equal to (" + num2 + ")" );
        }
        System.out.println( " (" + num1 + ") + (" + num2 + ") = (" +num1.add(num2) + ")" );
    }
}
