import java.util.Arrays;

public class SortingAnArrayOfNumbers {
    public static void main(String[] args) {
        String[] num = {"1, 2, 0", "4, 5", "11, 33, 22", "34, 87, 9, 23"};

        String numbers = Arrays.stream(num)
                .flatMap(numb -> Arrays.stream(numb.split(", ")))
                .map(Integer::valueOf)
                .sorted()
                .map(String::valueOf)
                .reduce("", (numb1,numb2)-> numb1.isEmpty() ? numb2 : numb1 + ", " + numb2);

        System.out.println(numbers);
    }
}
