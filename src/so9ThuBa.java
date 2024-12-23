import java.util.Scanner;

public class so9ThuBa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array ");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        int d = 0;
        int s = -1;
        for (int i = 0; i < n; i++) {
            if(a[i] == 9){
                d++;
                if(d == 3){
                    s = i;
                }
            }
        }
        if(s != -1){
            System.out.println("The element is " + (s + 1));
        }
        else{
            System.out.println("The element is not found");
        }
    }
}
