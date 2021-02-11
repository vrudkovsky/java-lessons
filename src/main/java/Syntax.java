public class Syntax {

    public int inc(int k) {
        return k + 1;
    }

    public void primitiveDataTypes() {
        byte b1 = 123;
        short s1 = (short) 0xCCCC;
        int i1 = 45355;
        long l1 = 1234_5678_1234_5678L;

        float f;
        double d;
        char c; // 'A' + 1 == 'B'
        int ai = 'A'; // 65
        char ci = 'A'; // A
        if (ai == ci) {
            System.out.println("true");
        }
        boolean b = true;
    }

    static class Person {
        int id;
        String name;

        public Person(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public void referenceTypes() {
        String s1 = new String("abc");
        String s2 = "abc";
        Person p = new Person(1, "Jim");
        int x = p.id;
        String n = p.name;
    }

    static int x;

    public static void main(String[] args) {
        System.out.println(x);
    }
}
