import java.net.SocketOption;
import java.util.Arrays;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        int a = 7;
        int b = 9;

        a=a+b;
        b=a-b;
        a=a-b;


        System.out.println(a);
        System.out.println(b);



    }
}