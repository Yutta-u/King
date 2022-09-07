import java.util.Scanner;

public class KIng {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int a1 = scan.nextInt();
        int b1 = scan.nextInt();

        if (a1 - a == 1 || b1 - b == 1 || -(a1 - a) == 1 || -(b1 - b) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
