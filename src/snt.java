import java.util.*;
public class snt {

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int countPrime(int[] a, int n) {
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (checkPrime(a[i])) {
                d++;
            }
        }
        return d;
    }

    public static void viewPrime(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (checkPrime(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static int sumPrime(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (checkPrime(a[i])) {
                sum += a[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int []a = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ":");
            a[i] = sc.nextInt();
        }
        System.out.println("Prime numbers are:" + countPrime(a, n));
        System.out.print("Prime are: ");
        viewPrime(a, n);
        System.out.println("\nSum of prime numbers: " + sumPrime(a, n));
    }
}
