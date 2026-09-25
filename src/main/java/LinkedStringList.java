class Node {
    String value;
    Node next;
    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
}

public class LinkedStringList implements StringList {
    int size;
    Node front;

    // How will be construct it?
    public LinkedStringList() {
        this.size = 0;
//        this.front = null;
        this.front = new Node(null, null); // dummy
    }

    // How will we implement the methods?
    public void prepend(String s) {
        this.front = new Node(s, this.front.next);
        this.size++;
    }

    public String get(int index) {
        Node temp = this.front;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    public int size() {
        return size;
    }

    public void add(String s) {
        Node temp = this.front;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = new Node(s, null);
    }
}