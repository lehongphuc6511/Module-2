package LinkedList;

import LinkedList.MyLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);


        ll.add(4, 9);
        ll.add(4, 9);
        ll.printList();
    }
}

