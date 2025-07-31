//package DOUBLELINKEDLIST;
import java.util.*;
class Node{
    int val;
    Node prev, next;
    Node(int val){
        this.val = val;
        prev = next = null;
    }
}
class DoubleLinkedList{
    Node head;
    void insertionAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    void insertionAtBegin(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    void insertAtPos(int val,int pos){
        if(pos < 0){
            System.out.println("Invalid postion");
            return;
        }
        if(pos == 0){
            insertionAtBegin(val);
            return;
        }
        Node current = head;
        Node newNode = new Node(val);
        int count = 0;
        while(current != null & pos > count){
            current = current.next;
            count++;
        }
        if (current == null || current.next == null) {
            insertionAtEnd(val);
            return;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }
    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.val + " -> "  );
            current = current.next;
        }
        System.out.print("null\n");
    }
    void displayBackward(){
        if(head == null){
            return;
        }
        Node current = head;
        while(current.next != null) current = current.next;
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.prev;
        }
        System.out.print("null\n");
    }
}
public class DoubleLinked{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
            while(true){
                System.out.println("1.Insert at begin 2.Insert by position 3.Insertion At End 4.Display 5.Display Backward 6.Exit\nEnter your choice: ");
                int choice = obj.nextInt();
                switch(choice){
                    case 1 :
                        System.out.println("Enter the Value: ");
                        int val = obj.nextInt();
                        list.insertionAtBegin(val);
                        break;
                    case 2:
                        System.out.println("Enter the Value: ");
                        val = obj.nextInt();
                        System.out.println("Enter the position: ");
                        int pos = obj.nextInt();
                        list.insertAtPos(val, pos);
                        break;
                    case 3:
                        System.out.println("Enter the value: ");
                        val = obj.nextInt();
                        list.insertionAtEnd(val);
                        break;
                    case 4:
                        list.display();
                        break;
                    case 5:
                        list.displayBackward();
                        break;
                    case 6:
                        obj.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }
            }
    }
}
