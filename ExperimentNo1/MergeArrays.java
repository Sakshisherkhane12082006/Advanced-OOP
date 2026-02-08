package ExperimentNo1;

class MergeArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] c = new int[6];
        int k = 0;

        for (int i = 0; i < 3; i++) {
            c[k] = a[i];
            k++;
        }

        for (int i = 0; i < 3; i++) {
            c[k] = b[i];
            k++;
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < 6; i++) {
            System.out.print(c[i] + " ");
        }
    }
}

