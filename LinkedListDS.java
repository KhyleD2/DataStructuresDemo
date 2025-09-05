import java.util.*;

public class LinkedListDS {
    static LinkedList<Integer> list = new LinkedList<>();

    public static void linkedListMenu(Scanner sc) {
        int choice;
        while (true) {
            System.out.println("\n--- Linked List Operations ---");
            System.out.println("1. Insert at end");
            System.out.println("2. Delete from beginning");
            System.out.println("3. Display");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.addLast(val);
                    System.out.println("Inserted " + val + " at end.");
                    break;
                case 2:
                    if (!list.isEmpty()) {
                        System.out.println("Deleted: " + list.removeFirst());
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 3:
                    System.out.print("List contents: ");
                    for (int num : list) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
