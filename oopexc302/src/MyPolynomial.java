import java.lang.StringBuffer;
public class MyPolynomial {
    private double[] coeffs;
    public MyPolynomial( double...coeffs){ // tham so VARARGS
        this.coeffs = coeffs;
    }
    // Bac cua da thuc nay vd (x^2+x+9)-> bac:(so co so)3-1=2
    public int getDegree(){
        return coeffs.length-1;
    }
    public String toString(){
        StringBuffer storeStr = new StringBuffer();
        for ( int i= coeffs.length-1; i>=0 ; i--){
            if( i== coeffs.length-1){
                storeStr.append(coeffs[i] + "*x^" + i);
            }
            else if (i==0){
                storeStr.append( "+" + coeffs[i]);
            }
            else{
                storeStr.append( "+" + coeffs[i] + "*x^" + i );
            }
        }
        return storeStr.toString();
    }
    public double evaluate( double x){
        double result = 0;
        for ( int i=coeffs.length-1 ; i>=0 ; i--){
            if( i==coeffs.length-1){
                result =result + (Math.pow(x,i) * coeffs[i]);
            }
            else if (i==0){
                result+= coeffs[i];
            }
            else{
                result+= Math.pow(x,i) * coeffs[i];
            }
        }
        return result;
    }
    public MyPolynomial add( MyPolynomial right){
        int maxlength = Math.max( coeffs.length , right.coeffs.length );
            double[] result = new double[ maxlength];
                    for ( int i=0; i < right.coeffs.length ; i++ ){
                        result[i] +=  right.coeffs[i];
                    }
                    for ( int i=0; i<coeffs.length; i++){
                        result[i] +=this.coeffs[i];
                    }
                return new MyPolynomial ( result );

    }
    public MyPolynomial multiply( MyPolynomial right){
        double[] result = new double[ coeffs.length + right.coeffs.length -1];
            for ( int i=0 ; i<coeffs.length ; i++ ){
                for ( int a=0 ; a<right.coeffs.length ; a++){
                    result[i+a] += this.coeffs[i] * right.coeffs[a];
                }
            }
        return new MyPolynomial (result);
    }
}
