import java.util.List;
import java.util.function.Function;

public class Task1 {
    public static String method(List<String> names) {
        Function<List<String>, String> function = list -> {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < list.size(); i++) {
                if (i % 2 != 0) {
                    line.append(i).append(". ").append(list.get(i)).append(", ");
                }
            }
            return line.delete(line.length() - 2, line.length() - 1).toString();
        };
        return function.apply(names);
    }
}