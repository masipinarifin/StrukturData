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
            while(last.head != null){
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
    public static LinkedList deleteKey(LinkedList list, int key)
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
}
