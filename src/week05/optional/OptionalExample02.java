package week05.optional;
import java.util.Optional;

public class OptionalExample02 {
    public static void main(String[] args) {
        Optional<String> nullStr= Optional.ofNullable(null);
        System.out.println(nullStr);
        nullStr= Optional.of("Gamze");
        nullStr.ifPresent(e-> System.out.println(e.toUpperCase()) );
        nullStr= Optional.empty();
        nullStr.ifPresent(e-> System.out.println(e.toLowerCase()));


    }
    public static Optional<String> findNameById(Long id) {
        if (id==1){
            return Optional.of("Gamze");
        } else {
            return null;

        }
    }
}
