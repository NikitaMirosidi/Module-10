import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Task 1:");
        System.out.println(Task1.method(Names.names));*/

        /*System.out.println("\nTask 2:");
        Task2 task2 = new Task2();
        System.out.println(task2.method(Names.names));*/

        System.out.println("\nTask 3:");
        Task3 task3 = new Task3();
        System.out.println(task3.method(Arrays.asList("\"1", "2", "0\"", "\"4", "5\"")));

        /*System.out.println("\nTask 4:");
        long seed = 533636365L;
        long a = 25214903917L;
        long c = 11L;
        long m = (long)Math.pow(2.0, 48.0);
        long size = 25L;
        Stream<Long> stream = Task4.generator(seed, a, c, m, size);
        stream.forEach(System.out::println);

        System.out.println("\nTask 5:");
        Stream<Integer> stream2 = Task5.zip(Stream.generate(() -> 6).limit(15), Stream.generate(() -> 9).limit(10));
        stream2.forEach(System.out::println);*/
    }
}