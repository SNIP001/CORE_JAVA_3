package $03_WrapperClasses;

public class CommandLineArguments {

    public static void main(String[] args) {
        int length = args.length;
        if (length == 0) {
            System.out.println("no inputs provided");
        }
    }
}
