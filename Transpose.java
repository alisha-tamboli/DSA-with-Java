public class Transpose {
    public static void main(String[] args) {
        
        int matrix[][] = {
            {1,5,7,9,10,11},
            {6,10,12,13,20,21},
            {9,25,29,30,32,41},
            {15,55,59,63,68,70},
            {40,70,79,81,95,105}
        };

        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("The Transpose of the matrix is : ");

        int rowStart = 0;
        int rowEnd = n;
        int colStart = 0;
        int colEnd = m;

        for(int col=colStart; col<colEnd; col++) {
            for(int row=rowStart; row<rowEnd; row++) {
                System.out.print(matrix[row][col] + " ");
            }
        
            System.out.println();
        }
    }
}
