package switch_case;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Pick one:");
        System.out.println("1. Hi");
        System.out.println("2. Hey");
        System.out.println("3. Hello");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        switch (x) {
            case 1:
                System.out.println("You said Hi");
                break;
            case 2:
                System.out.println("You said Hey");
                break;
            case 3:
                System.out.println("You said Hello");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
