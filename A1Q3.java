import java.util.*;

public class A1Q3 {
    static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> results = Arrays.asList(args);
        listTrim(results);
        for (String result : results) {
            System.out.println(result);
        }
    }
}