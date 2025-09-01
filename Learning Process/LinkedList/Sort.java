import java.util.*;
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
    void deleteAtbegin(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        head = head.next;

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
    void searchNode(int val){
        Node current = head;
        int count = 0;
        while(current != null && current.data != val){
            count++;
            current = current.next;
        }
        if(current == null){
            System.out.println("Value isn't found!");
            return;
        }
        else{
            System.out.println("Value is found at postion: " + count);
            return;
        }
    }
    void reverseList(){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("List is reversed!");
    }
    void printList(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null\n");
    }
    int getSize(){
        Node current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    void sort(){
        if(head == null || head.next == null){
            return;
        }
        Node sorted = null;
        Node current = head;
        while(current != null){
            Node nextNode = current.next;
            sorted = sortNodes(sorted,current);
            current = nextNode;
        }
        head = sorted;
    }
    Node sortNodes(Node sorted, Node newNode){
        if(sorted == null || sorted.data >= newNode.data){
            newNode.next = sorted;
            return newNode;
        }
        Node temp = sorted;
        while(temp.next != null && temp.next.data < newNode.data){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return sorted;
    }
}
public class Sort {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while (true) {
            System.out.print("1.Insert 2.Sort 3.Display 4.Exit\nEnter your choice: ");
            int choice = obj.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the value: ");
                    int val = obj.nextInt();
                    list.insertNode(val);
                    break;
                case 2:
                    list.sort();
                    break;
                case 3:
                    list.printList();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    obj.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        //obj.close();
    }
}
