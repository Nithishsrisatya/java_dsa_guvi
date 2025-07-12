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
        System.out.print("null");
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
}
public class FirstProblem {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        while(true){
            Scanner obj = new Scanner(System.in);
            System.out.print("\n1.Insert at begin 2.Insert at end 3.Insert by position 4.Delete by value 5.Delete by position 6.Delete at begin 7.Search 8.Reverse 9.Print the list 10.Exit\nEnter your choice: ");
            int n = obj.nextInt();
            switch(n){
                case 1:
                    System.out.println("Enter the value: ");
                    int val = obj.nextInt();
                    list.insertAtbegin(val);
                    break;
                case 2:
                    System.out.println("Enter the value: ");
                    val = obj.nextInt();
                    list.insertNode(val);
                    break;
                case 3:
                    System.out.println("Enter the value: ");
                    val = obj.nextInt();
                    System.out.println("Enter the position: ");
                    int pos = obj.nextInt();
                    if(list.getSize() < pos){
                        System.out.println("Invalid Position!");
                        break;
                    }
                    list.insertByPosition(val,pos);
                    break;
                case 4:
                    System.out.println("Enter the value: ");
                    val = obj.nextInt();
                    list.deleteNode(val);
                    break;
                case 5:
                    System.out.println("Enter the position: ");
                    pos = obj.nextInt();
                    list.deleteByPosition(pos);
                    break;
                case 6:
                    list.deleteAtbegin();
                    break;
                case 7:
                    System.out.println("Enter the value: ");
                    val = obj.nextInt();
                    list.searchNode(val);
                    break;
                case 8:
                    list.reverseList();
                    break;
                case 9:
                    list.printList();
                    break;
                case 10:
                    obj.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}