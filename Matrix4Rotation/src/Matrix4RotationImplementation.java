
class Matrix {
    int[][] matrix = {
            {11, 12, 13, 14},
            {21, 22, 23, 24},
            {31, 32, 33, 34},
            {41, 42, 43, 44}
    };




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

    public void matrix4Rotation() {
        int size = matrix.length;

        for (int i = 0; i < size / 2; i++) {
            for (int j = i; j < size - 1 - i; j++) {

                //assign top left value to a temp variable
                int temp = matrix[i][j];

                //bottom left to top left
                matrix[i][j] = matrix[size - 1 - j][i];

                //bottom right to bottom left
                matrix[size - 1 - j][i] = matrix[size - 1 - i][size - 1 - j];

                //top right to bottom right
                matrix[size - 1 - i][size - 1 - j] = matrix[j][size - 1 - i];

                //assign temp value to top right
                matrix[j][size - 1 - i] = temp;
            }
        }
    }


}


public class Matrix4RotationImplementation {
    public static void main(String[] args) {
        Matrix sampleMatrix = new Matrix();
        System.out.println("Original Matrix");
        sampleMatrix.display();
        System.out.println("rotated matrix");
        sampleMatrix.matrix4Rotation();

        sampleMatrix.display();
    }
}
