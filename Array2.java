import java.util.Scanner;
public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        //input
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum value is : " + max);
        System.out.println("The minimum avlue is : " + min);
    }
}
