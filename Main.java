import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nChoose Data Structure:");
            System.out.println("1. Stack");
            System.out.println("2. Queue");
            System.out.println("3. Linked List");
            System.out.println("4. Circular Linked List");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    StackDS.stackMenu(sc);
                    break;
                case 2:
                    QueueDS.queueMenu(sc);
                    break;
                case 3:
                    LinkedListDS.linkedListMenu(sc);
                    break;
                case 4:
                    CircularLinkedListDS.circularLinkedListMenu(sc);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
