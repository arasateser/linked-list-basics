package com.company;

class LinkedList { //singly linked list class
    Node head;     //head of the list

    class Node {   //node class
        int data;
        Node next;

        Node(int d) {   //constructors for new nodes
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

    public boolean searchNode(Node head, int w) {
        Node temp = head;       //
        while (temp != null) {
            if (temp.data == w) //checking if the node is the one we are looking for
                return true;    //thats the one!
            temp = temp.next;   //moving to the next node
        }
        return false;           //the data you are looking for is not in the list
    }

    public static void main(String[] args) {

        LinkedList liste = new LinkedList();

        liste.front(7); //{7}
        liste.front(1); //{1,7}
        liste.front(3); //{3,1,7}
        liste.front(2); //{2,3,1,7}

        System.out.println("Created Linked list is: ");
        liste.printList(); //{2,3,1,7}
        
        if (liste.searchNode(liste.head, 3))
            System.out.println("\nabout 3: I Found It!"); //about 3: I Found It!
        else
            System.out.println("\nabout 3: We have bad news...");

        if (liste.searchNode(liste.head, 21))
            System.out.println("\nabout 21: I Found It!");
        else
            System.out.println("\nabout 21: We have bad news..."); // about 21: We have bad news...

    }
}
