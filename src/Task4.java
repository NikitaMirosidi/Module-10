import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> generator(long seed, long a, long c, long m, long size) {
        return Stream
                .iterate(seed, x -> (a * x + c) % m)
                .limit(size);
    }
}