import java.util.*;

public class QueueDS {
    static Queue<Integer> queue = new LinkedList<>();

    public static void queueMenu(Scanner sc) {
        int choice;
        while (true) {
            System.out.println("\n--- Queue Operations ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int val = sc.nextInt();
                    queue.offer(val);
                    System.out.println("Enqueued " + val + " into queue.");
                    break;
                case 2:
                    Integer dequeued = queue.poll();
                    if (dequeued != null) {
                        System.out.println("Dequeued: " + dequeued);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    System.out.print("Queue contents: ");
                    for (int num : queue) {
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
