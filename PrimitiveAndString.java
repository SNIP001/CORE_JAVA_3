package $03_WrapperClasses;

public class PrimitiveAndString {

    public static void main(String[] args) {
        byte x = 100;

        String s = Byte.toString(x);
        System.out.println(s);

        byte y = Byte.parseByte(s);
        System.out.println(y);

    }
}
