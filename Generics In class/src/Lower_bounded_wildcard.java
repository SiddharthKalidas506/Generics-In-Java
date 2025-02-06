import java.util.ArrayList;
import java.util.List;

public class Lower_bounded_wildcard {

    public static void processMixedTypes(List<? super Integer> list) {
        list.add(100);   // Adding an integer works
        list.add(200);   // Adding another integer works
        // Cannot safely retrieve anything other than Object
    }

    public static void main(String[] args) {
        List<Object> objects = new ArrayList<>();
        processMixedTypes(objects);  // Works with List<Object>

        List<Number> numbers = new ArrayList<>();
        processMixedTypes(numbers);  // Works with List<Number>
        System.out.println(objects.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(0));
    }

}
