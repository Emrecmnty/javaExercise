import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        Optional<String> optional = Optional.ofNullable("Merhaba, Optional!");


        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        optional.ifPresent(System.out::println);

        String value = optional.orElse("Varsayılan Değer");
        System.out.println(value);

        Optional<String> empty = Optional.ofNullable(null);

        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
        // orelse , orelseget, orelsethrow
        // map, stream

    }
}