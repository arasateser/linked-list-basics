package com.company;

class LinkedList1 {    //singly linked list class
    Node head;        //head of the list

    static class Node {      //node class
        int data;
        Node next;

        Node(int d) {  //constructors for new nodes
            data = d;
            next = null;
        }
    }

    public void front(int new_data) {       //inserting a new node in front of the list
        Node new_node = new Node(new_data); //inserting a new node and assigning its data
        new_node.next = head;               //assigning new node's next as head
        head = new_node;                    //making the new node as head of the list
    }

    public void afterGiven(Node prev_node, int new_data) { // inserting a new node after the given previous node

        Node new_node = new Node(new_data);                //inserting a new node and assigning its data
        new_node.next = prev_node.next;                    //assigning new node's next as previous node's next
        prev_node.next = new_node;                         //assigning previous node's next as new node
    }

    public void latest(int new_data) {      //inserting a new node to end of the list

        Node new_node = new Node(new_data); //inserting a new node and assigning its data
        new_node.next = null;               //assigning new node's next as null

        if (head == null) {                 //checking if the list is empty or not
            head = new Node(new_data);      //if it is add the new node as head
            return;
        }

        //at this point we don't have any way to find the latest node except checking one by one
        //as we know(for singly linked lists) latest node's next is "NULL"
        //so we should look for a node which its next is "NULL"
        //and we should start from the head to make sure

        Node last = head;         //starting the process from the head

        while (last.next != null) //making the process running until finding a node's next as "NULL"
            last = last.next;     //if the node's next if not "NULL" move to the next node

        last.next = new_node;     //assigning current latest node's next as new node
    }


    public void printList() {                    //printing the list from the given node

        Node tnode = head;                       //starting the printing process from the head
        while (tnode != null) {                  //making the process running until reaching end of the list
            System.out.print(tnode.data + " ");  //printing current node
            tnode = tnode.next;                  //moving to the next node
        }
    }

    public static class Main {

        public static void main(String[] args) {
            LinkedList liste = new LinkedList();  //creating a empty list

            liste.latest(6);                      //adding a node END of the list
            //{6}->NULL

            liste.front(7);                       //adding a node HEAD of the list
            //{7,6}->NULL

            liste.front(1);                       //adding a node HEAD of the list
            //{1,7,6}->NULL

            liste.latest(4);                      //adding a node END  of the list
            //{1,7,6,4}->NULL

            liste.afterGiven(liste.head.next, 8); //adding a node AFTER the given number
            //{1,7,8,6,4}->NULL

            System.out.println("Created Linked List is:");
            liste.printList();                    //printing process
        }
    }
}
