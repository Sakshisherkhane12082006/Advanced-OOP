package ExperimentNo2;

class StaticDemo {
    static int a = 10;

    static {
        System.out.println("Static block executed");
    }

    static void show() {
        System.out.println("Static variable value: " + a);
    }

    public static void main(String[] args) {
        StaticDemo.show();
    }
}
