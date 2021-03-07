package lessonA4;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addHead(1);
        ll.addHead(12);
        ll.addHead(13);
        ll.addTail(20);
//        ll.addTail(5);
//        ll.addAfter(x -> x >= 10, 11);
//        ll.addBefore(x -> x >= 10, 11);
//        ll.remove(x -> x == 10);
        ll.lenght_iter();
        System.out.println(ll.lenght_iter());
        System.out.println(ll.lenght_hr());
        System.out.println(ll.toString_itr());

//        System.out.println(ll.contains(12));
//        System.out.println(ll.contains(11));
//        System.out.println(ll.contains2(12));
//        System.out.println(ll.contains2(11));
    }
}
