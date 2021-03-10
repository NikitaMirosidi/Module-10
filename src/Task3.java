import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public String method(List<String> list) {
        return list.stream()
                .map(s -> s.replaceAll("\\D+", ""))
                .sorted()
                .collect(Collectors.joining(", ", "\"", "\""));
    }
}