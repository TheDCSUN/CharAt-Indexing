import java.util.Scanner;
public class CharAtTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int n = sc.nextInt();
        System.out.println("Enter a character");
        char ch = sc.next().charAt(n);
        System.out.println(ch);
        sc.close();
    }
}
