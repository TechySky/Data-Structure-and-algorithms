class Matrix {
    int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
    };

    public void transposeMatrix() {
        int rowSize = matrix.length;
        int columnSize = matrix[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = i; j < columnSize; j++) {
                //assign value for temp variable
                int temp = matrix[i][j];

                matrix[i][j] = matrix[j][i];

                matrix[j][i] = temp;
            }
        }
    }


    public void display() {
        int rowSize = matrix.length;
        int columnSize = matrix[0].length;

        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }




}


public class MatrixTransposeImplementation {
    public static void main(String[] args) {
        Matrix sampleMatrix = new Matrix();
        System.out.println("Original Matrix");
        sampleMatrix.display();
        System.out.println("transposed matrix");
      sampleMatrix.transposeMatrix();

        sampleMatrix.display();
    }
}
