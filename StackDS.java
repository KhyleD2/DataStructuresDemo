import java.util.*;

public class StackDS {
    static Stack<Integer> stack = new Stack<>();

    public static void stackMenu(Scanner sc) {
        int choice;
        while (true) {
            System.out.println("\n--- Stack Operations ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println("Pushed " + val + " into stack.");
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;
                case 3:
                    System.out.print("Stack contents: ");
                    ListIterator<Integer> it = stack.listIterator(stack.size());
                    while (it.hasPrevious()) {
                        System.out.print(it.previous() + " ");
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
