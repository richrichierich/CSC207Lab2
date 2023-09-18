import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long s = 0L;
        // below is a "foreach" loop which iterates through numbers
        for (Integer x : numbers) {
            s = s + x;
        }
        return s;
    }
}
