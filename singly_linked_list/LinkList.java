package singly_linked_list;

public class LinkList
{
    Node head;

    LinkList()
    {
        this.head = null;
    }

    public class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(String data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data)
    {
        Node newNode = new Node(data);

        if (head == null)
        {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }

        current.next = newNode;
    }

    public void printList()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null)
        {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("Null");
    }

    public void deleteFirst()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }

        head = head.next;
    }

    public void deleteLast()
    {
        if (head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        else if (head.next == null)
        {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

}