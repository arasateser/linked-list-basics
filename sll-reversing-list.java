package com.company;

public class linkedList { //singly linked list class
    Node head;            //head of the list

    class Node {          //node class
        int data;
        Node next;

        Node(int d) {     //constructors for new nodes
            data = d;
            next = null;
        }
    }

    public void front(int new_data) {       //inserting a new node in front of the list
        Node new_node = new Node(new_data); //inserting a new node and assigning its data
        new_node.next = head;               //assigning new node's next as head
        head = new_node;                    //making the new node as head of the list
    }

    public void printList() {                      //printing the list from the given node

        Node tempNode = head;                      //starting the printing process from the head
        while (tempNode != null) {                 //making the process running until reaching end of the list
            System.out.print(tempNode.data + " "); //printing current node
            tempNode = tempNode.next;              //moving to the next node
        }
    }

    //since there is only one way in the list,
    //we must change the next of each node to its previous node
    //instead of its next

    public void reversingList() { //reversing linked list

        Node current = head;            //assigning a "head"
        Node prev = null, next = null;  //assigning a "previous" and "next"

        while (current != null) {       //keeping loop working until reaching to the "tail"
            next = current.next;        //making the "next" as current nodes next for changing to next node later
            current.next = prev;        //(*)making the current nodes next as "prev" for reversing its direction
            prev = current;             //taking "prev" to the current nodes place for changing NEXT NODES direction later(we will use it for (*))
            current = next;             //taking "current" to the next for changing NEXT NODES direction later
        }
        head = prev;                    //assigning head as "tail"
    }

    public static void main(String[] args) {
        linkedList liste = new linkedList();

        liste.front(7);  //{7}
        liste.front(1);  //{1,7}
        liste.front(3);  //{3,1,7}
        liste.front(2);  //{2,3,1,7}

        System.out.println("Before rev. Singly Linked List:");
        liste.printList();

        //reversing list from the head
        liste.reversingList(); //{7,1,3,2}

        System.out.println("\nAfter rev. Singly Linked List:");
        liste.printList();
    }
}
