import java.util.Scanner;

public class baiTap3 {
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
            System.out.println("a, b, c là ba cạnh của một tam giác");
        }
        else {
            System.out.println("a, b, c không phải là ba cạnh của một tam giác");
        }
    }
}
