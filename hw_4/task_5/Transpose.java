package practice.hw_4.task_5;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 4, 5, 6}, {1, 3, 4, 5, 6}, {1, 3, 4, 5, 6}, {1, 3, 4, 5, 6}, {1, 3, 4, 5, 6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t");
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }


        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Новая матрица");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t");
                System.out.print(matrix[i][j]);

            }
            System.out.println();
        }

    }
}
