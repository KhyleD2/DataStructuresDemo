import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

public class CircularLinkedListDS {
    static Node tail = null;

    public static void circularLinkedListMenu(Scanner sc) {
        int choice;
        while (true) {
            System.out.println("\n--- Circular Linked List Operations ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    insert(val);
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    display();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    static void insert(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        System.out.println("Inserted: " + val);
    }

    static void delete() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node head = tail.next;
        if (head == tail) {
            System.out.println("Deleted: " + head.data);
            tail = null;
        } else {
            System.out.println("Deleted: " + head.data);
            tail.next = head.next;
        }
    }

    static void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = tail.next;
        System.out.print("List contents: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail.next);
        System.out.println();
    }
}
