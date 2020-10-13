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

    void deletingNode(int key) {

        if (head == null) //checking if the list is empty or not
            return;

        Node temp = head; //storing the head for loops

        if (key == 0) {       //checking if head is the given key or not
            head = temp.next; //changing head to its next
            return;
        }

        if (temp == null || temp.next == null) //checking if the given key is more than number of the list
            return;

        // Find previous node of the node to be deleted
        for (int i = 1; temp != null && i < key - 1; i++) //finding the given positions previous node
            temp = temp.next;

        //temp -> next is the node to be deleted
        Node storeNode = temp.next.next; //storing pointer to the next of node to be deleted

        temp.next = storeNode;           //unlink the deleted node from list
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

        liste.front(7); //{7}
        liste.front(1); //{1,7}
        liste.front(3); //{3,1,7}
        liste.front(2); //{2,3,1,7}
        liste.front(8); //{8,2,3,1,7}

        System.out.println("Created Linked list is: ");
        liste.printList();

        // deleting the node at 4th(assuming head as 1st) position
        liste.deletingNode(4); //{8,2,3,7}

        System.out.println("\nLinked List after Deletion at position 4: ");
        liste.printList();
    }
}
