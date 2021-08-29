import java.util.*;

public class A1Q2 {

    static final Comparator<String> string_comparator = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        SortedSet<String> result = new TreeSet<String>(string_comparator);
        for (String arg : args) {
            result.add(arg);
        }
        System.out.println(result);
    }
}
