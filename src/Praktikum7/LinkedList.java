package Praktikum7;

/**
 *
 *  NURUL ARIFIN 19MI0016
 */







public class LinkedList {
    Node head; // head of list
    //Linked list Node
    //Node is a static nested class
    // so main() can access it
    static class Node{
        int data;
        Node next;
        //Constructor
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    //********INSERTION***********
    //Method to insert a new node
    public static LinkedList insert(LinkedList list, int data)
    {
        //Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;
        //if the LinkList is empty
        //then make the new node as head
        if(list.head == null){
            list.head = new_node;
        }
        else {
            //else tarverse till the last node
            //and insert the new node there
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            //insert the new_node at last node
            last.next = new_node;
        }
        
        //Return the list by head
        return list;
    }
    
    //***********TRAVERSAL*********
    //Method to print the LinkedList
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;
        System.out.print("\nLinkedList: ");
        //Traverse through the LinkedList
        while(currNode != null){
            //print the data at current node
            System.out.print(currNode.data + " ");
            //Go to next node
            currNode = currNode.next;
        }
        System.out.println("\n");
    }
    
    
    //Method to delete a node in the LinkedList by KEY
    public static LinkedList deleteByKey(LinkedList list, int key)
    {
        //Store a head Node
        Node currNode = list.head, prev = null;
        //Case 1
        //If head node itself hold the key to be deleted
        if(currNode != null && currNode.data == key){
            list.head = currNode.next; // changed head
            //Display the message
            System.out.println(key + " found and deleted");
            //Return the updated list
            return list;
        }
        //CASE 2
        //if the key is somewhere other than at head
        //Search for the key to be deleted
        //keep track of the previous node
        //as it is needed to change currNode.next
        while(currNode != null && currNode.data != key){
            //if currNode does not hold key
            //continue to next node
            prev = currNode;
            currNode = currNode.next;
        }
        //if the key was present, it should be at currNode
        //Therefore the currNode shall not be null
        if(currNode != null){
            //Since the key is at currNode
            //Unlink currNode from LinkedList
            prev.next = currNode.next;
            //Display the message
            System.out.println(key + " found and deleted");
        }
        //CASE 3
        //if key was not present in linkedlist
        //currNode should be null
        if(currNode == null){
            //Display the message
            System.out.println(key + " not found");
        }
        //return the list
        return list;
    }
    
    //***************** DELETION AT A POSITION ***********************
    // Method to delete a ode in the LinkedList by POSTION
    public static LinkedList
    deleteAtPosition(LinkedList list, int index)
    {
        //Store head node
        Node currNode = list.head, prev = null;
        //
        //CASE 1
        //if index is 0, then head node itself is to be
        //deleted
        if(index == 0 && currNode != null){
            list.head = currNode.next; //Changed head
            //Display the message
            System.out.println(
                index + " position element deleted ");
            //Return the updated List
            return list;
        }
        //
        //CASE 2:
        //if the index is greater than 0 but less than the
        //size of LinkedList
        //
        //The Counter
        int counter = 0;
        //count for the index to be deleted
        //keep track of the previous node
        //as it is needed to change currNode.next
        while(currNode != null){
            
            if (counter == index){
                //Since the currNode is the required
                //position Unlink currNode from linked list
                prev.next = currNode.next;
                //Display the message
                System.out.println(
                    index + " position element deleted");
                break;
            }
            else{
                //if current position is not the index
                //continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }
        //If the position element was found, it should be
        //at currNode Therefore the currNode shall not be
        //null
        //
        //CASE 3: The index is greater than else of the
        //LinkedList
        //
        //In this case, the currNode should be null
        if(currNode == null){
            //Display the message
            System.out.println(
                index + " position element not found");
        }
        //return the list
        return list;
    }
    //***************** MATH METHOD ********************
    //method to create a singly linked list with n nodes
    public static void main(String[] args)
    {
        // Start with the empty list
        LinkedList list = new LinkedList();
        //
        // ************ INSERTION **********
        //
        // insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);
        //print the LinkedList
        printList(list);
        //**********DELETION BY KEY ***********
        //Delete node with value
        //int this case the key is **at head**
        deleteByKey(list, 1);
        //print the LinkedList
        printList(list);
        //Delete node with value 4
        //in the this case the key is present ***in the
        //middle**
        deleteByKey(list, 4);
        //print theLinkedList
        printList(list);
        //Delete node with value 10
        //In this case the key is ***not present***
        deleteByKey(list, 10);
        //print the LinkedList
        printList(list);
        //*****DELETION AT POSITION****
        //Delete node at position 0
        //In this case the key is **at head***
        deleteAtPosition(list, 0);
        //Print the LinkedList
        printList(list);
        //Delete node at position 2
        //in this case the key is present *** in the
        //middle***
        deleteAtPosition(list, 2);
        //print the LinkedList
        printList(list);
        //Delete node at position 10
        //In this case the key is ***not present***
        deleteAtPosition(list, 10);
        //Print the LinkedList
        printList(list);
    }
}