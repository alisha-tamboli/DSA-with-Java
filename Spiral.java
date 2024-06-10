public class Spiral {
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

        System.out.println("The SPiral order of the matrix is : ");

        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //To print Spiral order of mtrix
        while(rowStart <= rowEnd && colStart <= colEnd) {

            //1
            for(int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            //2 
            for(int row = rowStart; row<=rowEnd; row++) {
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            //3
            for(int col = colEnd; col>=colStart; col--) {
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //4
            for(int row = rowEnd; row>=rowStart; row--) {
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();
        }
    }
}
