package com.interview;

public class ApptioLLprintandRemoveAlternate {

    static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.next= new Node(2);
        root.next.next=new Node(3);
        root.next.next.next=new Node(4);
        root.next.next.next.next=new Node(5);
        print(root);

    }

    public static void print(Node root){
        while (root!=null){
            System.out.println(root.data);
            root=root.next;
        }
    }

    public static void removeOddElement(Node root){
        Node tempNode = new Node(100);
        int i=0;
        while(root!=null){
            if(i%2!=0){
                tempNode=root.next.next;
            }
        }
    }
}
