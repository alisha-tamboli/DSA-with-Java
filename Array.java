import java.util.Scanner;
class Array{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String name[] = new String[size];

        for(int i=0; i<name.length; i++) {
            name[i] = sc.next();
        }

        for(int i=0; i<name.length; i++) {
            System.out.println("The name is : " + name[i]);
        }
        sc.close();
    }
}