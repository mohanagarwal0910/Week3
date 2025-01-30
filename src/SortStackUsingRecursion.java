    import java.util.Stack;
    public class SortStackUsingRecursion {
        public static void sortStack(Stack<Integer> stack) {
            if (!stack.isEmpty()) {
                // Remove the top element
                int top = stack.pop();
                // Recursively sort the remaining stack
                sortStack(stack);
                // Insert the popped element in the correct position
                insertSorted(stack, top);
            }
        }
        private static void insertSorted(Stack<Integer> stack, int element) {
            if (stack.isEmpty() || stack.peek() <= element) {
                stack.push(element);
                return;
            }
            // Remove the top element
            int top = stack.pop();
            // Recur to insert element in correct position
            insertSorted(stack, element);

            // Push the top element back
            stack.push(top);
        }
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();
            stack.push(3);
            stack.push(1);
            stack.push(4);
            stack.push(2);
            stack.push(5);
            System.out.println("Original Stack: " + stack);
            sortStack(stack);
            System.out.println("Sorted Stack: " + stack);
        }
    }
