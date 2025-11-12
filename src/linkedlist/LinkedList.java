package linkedlist;


public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size = 0;

    public LinkedList() {}

    public void addTail(T element) {
        Node<T> newNode = new Node<>(element);
        if(size == 0) {
            this.head = newNode;
        }else{
            tail.setNext(newNode);
        }
        this.tail = newNode;
        size++;
    }


    public void deleteAll(){
        Node<T> temp = head;
        while(temp != null){
            Node<T> next = temp.getNext();
            temp.setElement(null);
            temp.setNext(null);
            temp = next;
        }

        this.head = null;
        this.tail = null;
        this.size = 0;
    }



    public void printAll(){
        if(size == 0){
            System.out.println("List is Empty");
        }
        Node<T> temp = head;
        while(temp!=null){
            System.out.println(temp.getElement());
            temp = temp.getNext();
        }
    }




    public int getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
