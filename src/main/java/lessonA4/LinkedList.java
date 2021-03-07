package lessonA4;

import java.util.StringJoiner;

public class LinkedList {




    static class Node {
        Integer value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;

    public void addHead(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public int lenght_iter() {
        int len = 0;
        Node curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        return len;

    }

    public int lenght_hr_from(Node curr) {
        if (curr == null) return 0;

        return 1 + lenght_hr_from(curr.next);
    }

    public int lenght_hr() {
        return lenght_hr_from(head);
    }

    public void lenght_tr() {
        throw new IllegalArgumentException();
    }


    private boolean contains(Node curr, int value) {
        while (curr != null) {
            if (curr.value == value) return true;
            curr = curr.next;
        }
        return false;
    }

    public boolean contains(int value) {
        return contains(head, value);
    }

    private boolean contains2(Node curr, int value) {
        if (curr == null) return false;
        if (curr.value == value) return true;
        return contains(curr.next, value);
    }




    public boolean contains2(int value) {
        return contains2(head, value);
    }

    public Node addTail(Node curr, int value) {
        if (curr == null) return new Node(value);
        curr.next = addTail(curr.next, value);
        return curr;
    }

    public void addTail(int value) {
        addTail(head, value);
    }




    public String toString_itr() {
        StringJoiner sj = new StringJoiner(", ", "LL:[", "]");
        Node curr = head;
        while (curr != null) {
            sj.add(curr.value.toString());
            curr = curr.next;
        }

        return sj.toString();
    }
}
