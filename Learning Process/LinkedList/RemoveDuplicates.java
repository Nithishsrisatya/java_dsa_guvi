//ackage Learning Process.LinkedList;
import java.util.*;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head = null;
    }
    void insert(int val){
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
    }
    void removeDuplicates(){
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while(current != null){
            if(set.contains(current.val)){
                prev.next = current.next;
            }
            else{
                set.add(current.val);
                prev = current;
            }
            current = current.next;
        }
    }
    void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.print("null\n");
    }
}
public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        LinkedList list = new LinkedList();
        while(true){
            System.out.print("1.Insert 2.Remove Duplicates 3.Display 4.Exit\nEnter your choice: ");
            int choice = obj.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the value: ");
                    int val = obj.nextInt();
                    list.insert(val);
                    break;
                case 2:
                    list.removeDuplicates();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                obj.close();
                    System.exit(0);
                    break;
                default:
                    System.out.print("Invalid choice");
            }
        }
    }
}
