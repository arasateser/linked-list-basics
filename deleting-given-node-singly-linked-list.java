package com.company;

class LinkedList { //singly linked list class
    Node head;     //head of the list

    class Node {   //node class
        int data;
        Node next;

        Node(int d) {    //constructors for new nodes
            data = d;
            next = null;
        }
    }

    // in this method we have to check nodes ONE BY ONE*
    // because of this if the given number is repeating in the list
    // we can only delete the first one
    // if we want to delete a given number rather than the first in the list
    // we have to give the specific position. Here is a example.

    void deletingNode(int key) {                  //deleting the 1st encounter of the given key

        Node temp = head, prev = null;            // *storing the head

        if (temp != null && temp.data == key) {   //if the given node is "head" we have to assign a new head before deletion
            head = temp.next;                     //assigning a new head
            return;
        }

        while (temp != null && temp.data != key) { //finding the given key
            prev = temp;                           //keeping the track of the previous node
            temp = temp.next;                      //if given node is not found yet go for its next
        }

        if (temp == null) return; //if the given key is not in the list

        prev.next = temp.next;    //unlinking the node from the list
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

    public static void main(String[] args) {
        LinkedList liste = new LinkedList();

        liste.front(7);  //{7}
        liste.front(1);  //{1,7}
        liste.front(3);  //{3,1,7}
        liste.front(2);  //{2,3,1,7}

        System.out.println("Linked List Before Deletion:");
        liste.printList();

        liste.deletingNode(1); //{2,3,7}

        System.out.println("\nLinked List After Deletion:");
        liste.printList();
    }
}
