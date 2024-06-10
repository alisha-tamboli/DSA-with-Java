import java.util.Scanner;

public class Array2D {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("give the number of rows of array :");
        int rows = sc.nextInt();
        
        System.out.println("give the number of cols of array :");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //searching a value in 2D array
        System.out.println("entre a key value to search : ");
        int key = sc.nextInt();
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(arr[i][j] == key) {
                    System.out.println("The value found at index (" + i + "," + j + ")");
                }
            }
        }
    }   
}
