//package Learning Process.LinkedList;
//import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    void insertNode(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    void insertAtbegin(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }
    void insertByPosition(int val,int pos){
        if(pos < 0){
            System.out.println("Invalid postion");
            return;
        }
        Node newNode = new Node(val);
        if( pos == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 0;
        while(current !=null && count < pos -1){
            current = current.next;
            count++;
        }
        if(current == null){
            System.out.println("Invalid position");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    void deleteNode(int val){
        if(head == null){
            System.out.print("List is Empty!");
            return;
        }
        if(head.data == val){
            head = head.next;
            return;
        }
        Node current = head;
        while(current != null && current.next.data != val){
            current = current.next;
        }
        if(current.next == null){
            System.out.println("Value isn't found!");
            return;
        }
        current.next = current.next.next;
    }
    void deleteByPosition(int pos){
        if(pos < 0){
            System.out.println("Invalid Postiton!");
            return;
        }
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        if(pos == 0){
            head = head.next;
            return;
        }
        Node current = head;
        int count = 0;
        while(current != null && count < pos - 1){
            current = current.next;
            count++;
        }
        if(current == null || current.next == null){
            System.out.println("Invalid position!");
            return;
        }
        current.next = current.next.next;
    }
    void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }

}
public class FirstProblem {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertNode(10);
        list.insertNode(20);
        list.insertNode(30);
        list.printList();
        System.out.println();
        list.insertAtbegin(2);
        list.printList();
        System.out.println();
        list.insertByPosition(15,2);
        list.printList();
        System.out.println();
        list.deleteNode(20);
        list.printList();
        System.out.println();
        list.deleteByPosition(5);
        list.printList();
    }
}
