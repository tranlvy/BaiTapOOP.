public class MyComplex {
    private double real,imag;
    public MyComplex(){
        this.real = 0;
        this.imag = 0;
    }
    public MyComplex( double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real=real;
    }
    public double getImag(){
        return imag;
    }
    public void setImag(double imag){
        this.imag=imag;
    }
    public void setValue( double real, double imag){
        this.real=real;
        this.imag=imag;
    }
    public String toString(){
        return real + "+" + imag + "i";
    }
    // neu so phuc la so thuc (a+bi)->b=0
    public boolean isReal(){
        return (imag==0);
    }
    // neu so phuc la so thuan ao (a+bi)->a=0
    public boolean isImaginary(){
        return (real==0);
    }
    public boolean equals(double real, double imag){
        return (real==this.real && imag==this.imag);
    }
    public boolean equals( MyComplex another){
        return (another.real==this.real && another.imag==this.imag);
    }
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    public double argument(){
        return Math.toRadians(Math.atan2(imag,real));
    }
    // Tra ve gia tri moi cho doi tuong cu
    public MyComplex add(MyComplex right){
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this;
    }
    // tra ve doi tuong moi cho doi tuong thu 3
    public MyComplex addNew( MyComplex right){
        return new MyComplex( this.real + right.real, this.imag + right.imag );
    }
    public MyComplex subtract(MyComplex right){
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this;
    }
    public MyComplex subtractNew( MyComplex right){
        return new MyComplex( this.real - right.real , this.imag - right.imag );
    }
    // (a+bi) * (c+di) = (ac-bd) + (ad+bc)i
    public MyComplex multiply( MyComplex right){
        this.real = (this.real * right.imag) - (this.real * right.real);
        this.imag = (this.real * right.imag) + (this.imag * right.real);
        return this;
    }
    // (a+bi)/(c+bi)=[(a+bi) * (c-di)] / (c*c + d*d)
    public MyComplex divide( MyComplex right){
        double u2 = (right.real * right.real + right.imag * right.imag);
        this.real = ((this.real * right.real) + (this.imag * right.imag))/u2 ;
        this.imag = ((this.imag * right.real) - (this.real * right.imag))/u2;
        return this;
    }
    public MyComplex conjugate(){
        return new MyComplex( this.real, - this.imag);
    }



}
