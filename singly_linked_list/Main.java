package singly_linked_list;

public class Main {

    public static void main(String args[])
    {
        LinkList ll = new LinkList();

        ll.addFirst("am");
        ll.addFirst("I");
        ll.printList();

        ll.addLast("programmer");
        ll.printList();

        ll.deleteFirst();
        ll.printList();

        ll.deleteLast();
        ll.printList();

        ll = null;
    }

}
