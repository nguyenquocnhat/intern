import java.util.Scanner;

public class baiTap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào ba cạnh của tam giác");
        System.out.print("Cạnh a: ");
        int a = sc.nextInt();
        System.out.print("Cạnh b: ");
        int b = sc.nextInt();
        System.out.print("Cạnh c: ");
        int c = sc.nextInt();
        if(a + b > c && a + c > b && b + c > a){
            if(a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){
                System.out.println("a, b, c là ba cạnh của một tam giác vuông");
            }
            else{
                System.out.println("a, b, c không phải là ba cạnh của một tam giác vuông");
            }
        }
        else{
            System.out.println("a, b, c không phải là ba cạnh của một tam giác");
        }
    }
}
