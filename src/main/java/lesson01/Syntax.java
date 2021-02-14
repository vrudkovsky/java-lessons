package lesson01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Syntax {

    public int inc(int k) {
        return k + 1;
    }

    public void primitiveDataTypes() {
        // stack
        byte b1 = 123; // - 2^7 -1 ... + 2^7 // -128..127
        short s1 = (short) 0xCCCC;
        int i1 = 454355; // -2^31 .. 2^31
        long l1 = 1234_5678_1234_5678L;
        int xx = (int)1234_5678_1234_5678L; //  8->4 unsafe
        long ll = i1; // 4->8 safe

        float f;
        double d;
        char c; // short UTF18, 2 bytes
        int ai = 'A'; // 65
        char ci = 'A'; // A
        if (ai == ci) { }
        boolean b = true;
    }

    static class Person {
        int id;
        String name;

        public Person() {
        }

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public void referenceTypes() {
        // heap
        String s1 = new String("abc");
        String s2 = "abc";
        Person p = new Person();
        int x = p.id; // id == 0
        String n = p.name;
        Person p1 = null;
    }

    // heap
    static int x;

    public void  doSmth(Person p) {
    }

    public static void doSmth1(Function<String, Integer> f) {
        String s ="abc";
        Integer applied = f.apply(s);
    }

    public static void main1(String[] args) {
        Person px = new Person();
        Function<String, Integer>f1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        doSmth1(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        });
// 8 +
        Function<String, Integer>f = String::length;
        doSmth1(s -> {
            return px.id;
        });
        doSmth1(String::length);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
//    a.add("ffdd");
//    a.add(new Person(4, "Jim"));
        System.out.println(x);
    }

    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);

        for (int i = 0; i < 5; i++) {
            int j;
        }
//    while (false) {
//      break;
//      continue;
//    }

        do {

        }while (false);

        int k = 8;
//    for(;p.next != null; p = p.next) {
//      break;
//    }
        int x = 6;
        switch (x) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
//      default: throw new IllegalArgumentException("shouldn't be there x ="+x);
        }

        String s =
                IntStream.rangeClosed(1, 100)
                        .filter(q -> q % 2 == 0)
                        .mapToObj(a -> String.format("<<%d>>", a))
                        .collect(Collectors.joining(","));

        System.out.println(s);

        Map<Integer, List<Integer>> collect = IntStream
                .rangeClosed(1, 100)
                .boxed()
                .collect(Collectors.groupingBy(a -> a % 10));

        System.out.println(collect);
    }

}
