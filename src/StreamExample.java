import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        // Stream API, öğe dizilerini işlemek için fonksiyonel bir yaklaşım sağlar. Filtreleme, haritalama, azaltma gibi işlemleri destekler.
        List<String> strings = Arrays.asList("bir", "iki", "üç", "dört");
        strings.stream()
                .filter(s -> s.startsWith("ü"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

       // reduce tek bir sonuç döndürmek için kullanılır

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);


        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum: " + sum); // Sum: 15
  // İç içe listeleri düzleştirir
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("A", "B"),
                Arrays.asList("C", "D"),
                Arrays.asList("E", "F")
        );


        List<String> flatList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList); // [A, B, C, D, E, F]

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Listeyi büyük harflerle toplar
        List<String> uppercaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);

        // İsimleri ilk harfe göre gruplayarak bir harita oluşturur
        Map<Character, List<String>> groupedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(groupedByFirstLetter);



        IntStream
                .range(1,10)
                .skip(2)
                .forEach(System.out::println);

    }
}