import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public String method(List<String> list) {
        return list.stream()
                .map(s -> s.split("\\D+"))
                .flatMap(Arrays::stream)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(", "));
    }
}