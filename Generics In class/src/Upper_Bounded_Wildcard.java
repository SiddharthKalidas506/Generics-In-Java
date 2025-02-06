import java.util.List;

public class Upper_Bounded_Wildcard {

    public void printNumbers(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

    }
}
