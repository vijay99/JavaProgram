package com.data_structure;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class LinkedListImplementation {
    //head node reference
    Node head;

    public static void main(String[] args) {

        LinkedListImplementation myLinkedList = new LinkedListImplementation();
        myLinkedList.addAtTail(10);
        myLinkedList.addAtTail(20);

        myLinkedList.print(myLinkedList.head);


    }

    //method to add element in the end
    public void addAtTail(int data) {
        Node newNode = new Node(data);
        newNode.next=null;
        if (head == null)
            head = newNode;
        else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

        //method to print the linked list

        public void print (Node head){
            if (head == null)
                System.out.println("Linked list is empty");

            while (head != null) {
                System.out.println("Elements are :" + head.data);
                head = head.next;
            }
        }


    }

    //Class to represent node
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }


