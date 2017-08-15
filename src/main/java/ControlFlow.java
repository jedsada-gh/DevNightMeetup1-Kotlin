import java.util.Objects;

public class ControlFlow {

    public static void main(String[] args) {


        // Java
        Object xo = 4;

        String result = "";
        if (xo instanceof Integer) {
            System.out.println(String.format("%d", ((int) xo) + 6));
            result = "xo is int";
        } else if (xo instanceof String) {
            System.out.println(String.format("%d", ((String) xo).length()));
            result = "xo is String";
        } else {
            result = "xo is unknown";
        }

        System.out.println(result); // output
                                    // 10
                                    // xo is Int


        
    }
}
