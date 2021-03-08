import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        long limit = Math.min(firstList.size(), secondList.size());
        List<T> firstSublist = firstList.subList(0, (int)limit);
        List<T> secondSublist = secondList.subList(0, (int)limit);

        List<T> temp = Stream
                .concat(firstSublist.stream(), secondSublist.stream())
                .collect(Collectors.toList());
        Collections.shuffle(temp);
        return temp.stream();
    }
}