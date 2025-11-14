package stack;

import linkedlist.Node;

public class Stack <T>{

    private Node<T> head;
    private int size;


    public Stack() {};

    public void push(T element){
        Node<T> newNode = new Node<>(element);
        newNode.setNext(head);
        head = newNode;

    }
    public T pop(){
        if(head == null){
            return null;
        }
        Node<T> temp = head;
        head = head.getNext();
        temp.setNext(null);

        return temp.getElement();
    }

    public void printStack(){
        Node<T> temp = head;
        while(temp != null){
            System.out.println(temp.getElement());
            temp = temp.getNext();
        }
    }

    public Stack<T> reverse(){

        Stack<T> reversed = new Stack<>();
        while(this.head != null){
            reversed.push(this.pop());
        }

        return reversed;

    }

}
