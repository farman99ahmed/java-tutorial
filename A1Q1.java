import java.util.*;

class A1Q1 {
    public static void main(String[] args) {
        List<String> argumentList = Arrays.asList(args);
        Collections.shuffle(argumentList);
        //Using for loop
        for (String arg: argumentList) {
            System.out.println(arg);
        }
        //Using streams
        argumentList.stream().forEach(arg->System.out.println(arg));
    }
}