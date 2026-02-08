package ExperimentNo1;

class MatrixOperation {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] c = new int[2][2];

        int ch = 1; // 1-Add, 2-Multiply, 3-Transpose

        switch (ch) {

            case 1:
                System.out.println("Addition:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = a[i][j] + b[i][j];
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                System.out.println("Multiplication:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        c[i][j] = 0;
                        for (int k = 0; k < 2; k++) {
                            c[i][j] = c[i][j] + a[i][k] * b[k][j];
                        }
                        System.out.print(c[i][j] + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                System.out.println("Transpose:");
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}

