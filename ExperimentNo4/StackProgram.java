package ExperimentNo4;

interface Stack {
    void push(int data);
    void pop();
    void display();
}

class IntegerStack implements Stack {

    int arr[];
    int top;
    int size;

    IntegerStack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int data) {
        if (top == size - 1) {
            System.out.println("Stack Overflow!");
        } else {
            arr[++top] = data;
            System.out.println(data + " pushed");
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
        } else {
            System.out.println(arr[top] + " popped");
            top--;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack Elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class StackProgram {
    public static void main(String[] args) {

        IntegerStack s = new IntegerStack(3);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);   // Overflow

        s.display();

        s.pop();
        s.display();
    }
}
