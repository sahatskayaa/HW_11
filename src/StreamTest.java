import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Katarzyna", "Ewa", "Michal", "Zuza", "Marek", "Luda", "Adam");
        String result = getIndexedNames(names);
        System.out.println(result);
    }

    public static String getIndexedNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(name -> name % 2 == 0)
                .mapToObj(name -> (name + 1) + ". " + names.get(name))
                .collect(Collectors.joining(", "));
    }
}