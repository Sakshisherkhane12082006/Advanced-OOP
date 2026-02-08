package ExperimentNo2;

class StackQueue {
    public static void main(String[] args) {

        int[] stack = new int[3];
        int top = -1;

        
        stack[++top] = 10;
        stack[++top] = 20;
        stack[++top] = 30;

        System.out.println("Stack elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

        int[] queue = new int[3];
        int front = 0, rear = -1;

        
        queue[++rear] = 1;
        queue[++rear] = 2;
        queue[++rear] = 3;

        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }
}
