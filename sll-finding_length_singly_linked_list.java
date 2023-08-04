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

    public int getLength() { //getting length of the list
        Node current = head;          //starting the counting from the "head"
        int count = 0;
        while (current != null) {     //running the list until reaching end of the list
            count++;                  //counting nodes
            current = current.next;   //moving to the next node
        }
        return count;                 //returning length of the list to the main function
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

        System.out.print("Linked List Before Deleting It> ");
        liste.printList(); //{2,3,1,7}

        System.out.println("\nLength of this list is: " + liste.getLength());


    }
}
