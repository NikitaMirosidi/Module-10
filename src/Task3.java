import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public String method(List<String> list) {
        return list.stream()
                .map(s -> s.split("\\D+"))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));
    }
}