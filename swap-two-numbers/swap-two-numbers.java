import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Swapping values using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}