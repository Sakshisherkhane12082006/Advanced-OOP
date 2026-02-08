package ExperimentNo1;

class SortArray {
    public static void main(String[] args) {
        int[] a = {5, 3, 8, 1, 2, 9, 4, 7, 6, 0};
        int temp;

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
