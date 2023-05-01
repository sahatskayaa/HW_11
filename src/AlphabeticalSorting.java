import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AlphabeticalSorting {
    public static void main(String[] args) {
        Stream<String> names =
                Arrays.asList("Ivan", "Katarzyna", "Ewa", "Michal", "Zuza", "Marek", "Luda", "Adam")
                        .stream()
                        .map(String::toUpperCase)
                        .sorted(Comparator.reverseOrder());


        List<String> filteredNames = names.collect(Collectors.toList());

        System.out.println(filteredNames);
    }

}
