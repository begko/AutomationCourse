import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class FindFirstWithStream {

    public static int findFirstWithStream(List<Integer> list, Predicate<Integer> condition) {
        Optional<Integer> result = list.stream()
                                       .filter(condition)
                                       .findFirst();

        return result.orElse(-1);
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 10, 15, 17, 20, 25, 30);

        Predicate<Integer> greaterThan17 = n -> n > 17;
        int result = findFirstWithStream(numbers, greaterThan17);

        System.out.println("The first number greater than 17: " + result);
    }
}
