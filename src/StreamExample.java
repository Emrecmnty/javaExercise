import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {
        // Stream API, öğe dizilerini işlemek için fonksiyonel bir yaklaşım sağlar. Filtreleme, haritalama, azaltma gibi işlemleri destekler.
        List<String> strings = Arrays.asList("bir", "iki", "üç", "dört");
        strings.stream()
                .filter(s -> s.startsWith("ü"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


        IntStream
                .range(1,10)
                .skip(2)
                .forEach(System.out::println);

    }
}