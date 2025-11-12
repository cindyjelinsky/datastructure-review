package linkedlist;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addTail(1);
        list.addTail(2);
        list.addTail(3);

        list.printAll();

        list.deleteAll();
        list.printAll();

    }
}
