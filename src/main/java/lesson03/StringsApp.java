package lesson03;


import java.io.Closeable;
import java.io.InputStream;
import java.util.Scanner;

public class StringsApp {

    static class Person implements Closeable {
        final int id;

        Person(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null) return false;
            if (o == this) return true;
            if (o.getClass() != Person.class) return false;

            Person that = (Person) o;

            return this.id == that.id;
        }

        @Override
        public void close() {

        }
    }

    public static void main1(String[] args) {
        String s = "Hello!";                    // String Pool, never GC
        String x = new String("Hello!"); // heap, GC
        s.substring(2,4); // [2, 4) "ll"
        String h = "H";
        String ello = "ello!";
//    s == "Hello!"
        if(s == h + ello) {}      // false, pointers
        if(s.equals(h + ello)) {} // true, by contents
        s.startsWith("H");
        s.endsWith("!");
        s.contains("ll");
        s.length();
        char c = s.charAt(2);
        String[] s1 = s.split(" ");
        byte[] bytes = s.getBytes();
        s.indexOf("l"); // 2
        s.lastIndexOf("l"); // 3
        s.replace("ll", "LLLL");
        String replaced = s.replace('l', 'L');
        s.trim().isEmpty(); // isBlank
    }

    public static void main2(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }

    public static void main(String[] args) {
        InputStream is = System.in;
        Scanner sc = new Scanner(is);

        String next = sc.next();
        int i = sc.nextInt(); //
        sc.close();

        try (Scanner scan = new Scanner(System.in)) {
            scan.next();
            scan.next();
            scan.next();
        }

    }
}
