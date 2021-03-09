import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static String method(List<String> names) {
        return names.stream()
                .filter(s -> names.indexOf(s) % 2 != 0)
                .map(s -> names.indexOf(s) + ". " + s)
                .collect(Collectors.joining(", "));
    }
}