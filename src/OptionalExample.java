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
    /*     orelse , orelseget, orelsethrow
        orElse her durumda alternatif değeri oluşturur.
        orElseGet alternatif değeri sadece gerekli olduğunda oluşturur.
                orElseThrow alternatif bir değer yerine bir istisna fırlatır.

        final Java'da değişkenlerin, metodların ve sınıfların değişmezliğini sağlar.
Thread safety, çoklu thread'lerin güvenli bir şekilde çalışmasını sağlar.
Concurrency, aynı anda birden fazla işlemin yürütülmesini ifade eder.
Mutable nesneler değiştirilebilir, immutable nesneler ise değiştirilemez.

         */

    }
}