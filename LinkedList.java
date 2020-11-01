package com.company;

public class LinkedList {
    Node head;

    class Node {   //node class
        int data;
        Node next;

        Node(int d) {    //constructors for new nodes
            data = d;
            next = null;
        }
    }

    //Java uses "garbage collection" system
    //So basically when we run an app Java checks for "unreferenced objects"
    //If there is one Java deletes it by itself
    //In other words we will make our list "non-functional"

    void deleteTheList() {
        head = null;  //Disappearing the head of the list. So there is nothing to move on. It is "non-functional" now. Let the Java to do its job. Do not hate me for adding this simple project to my GitHub. Im trying to show my work count a lot. Im sorry okay! I need more ideas. You can move to the next subject now. Leave me alone!
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

        System.out.println("\nLinked List Before Deleting It>");
        liste.printList(); //{2,3,1,7}

        liste.deleteTheList();

        System.out.println("\n\nLinked List After Deleting It>");
        liste.printList(); //{}
    }
}