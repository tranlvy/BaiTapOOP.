public class TestMain {
    public static void main(String[] args){
        MyComplex mc1= new MyComplex();
        System.out.println(mc1);
        mc1.setReal(1);
        mc1.setImag(1);
        System.out.println( mc1.getReal() + "+" + mc1.getImag() + "i");

        mc1.setValue(3.14,2);
        System.out.println(mc1);
        mc1.setValue(0,4);
        System.out.println( " is real: " + mc1.isReal());
        mc1.setValue(0,0);
        System.out.println( " is imaginary: " + mc1.isImaginary());
        mc1.setValue(1,0);
        System.out.println( " is imaginary: " + mc1.isImaginary());

        System.out.println( "1=1 && 0=1 is" + mc1.equals(1,1));
        MyComplex mc2 = new MyComplex(4,5);
        System.out.println( " mc1 = mc2 is " + mc1.equals(mc2));
        System.out.println( " |mc2|=" + mc2.magnitude());
        System.out.println( " |mc1|=" + mc1.magnitude());

        mc1.add(mc2);
        System.out.println(mc1);
        mc2.add(mc1);
        System.out.println(mc2);
        MyComplex mc3 = mc1.addNew(mc2);
        System.out.println(mc3);
    }
}
