package $03_WrapperClasses;

public class PrimitiveAndObject {

    public static void main(String[] args) {
        int x = 30;
        
        //boxing
        Integer y = Integer.valueOf(x);
        System.out.println(y);
        
        //unboxing
        int z = y.intValue();
        System.out.println(x);
    }

}
