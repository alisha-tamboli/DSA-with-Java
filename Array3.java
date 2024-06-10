import java.util.Scanner;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("give the size of array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // ckeck sorted or not
        boolean isAscending = true;

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) 
            isAscending = false;
        } 

        if(isAscending) {
            System.out.println("The Array is sorted in ascending order!!");
        }
        else{
            System.out.println("The Array is not sorted in ascending order!!!");
        }
        
    }
}
