import java.util.Scanner;

public class TryCatchArithematicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the interger : ");
        String str = sc.nextLine();
        int in;
        try {
            in = Integer.parseInt(str);
            System.out.println("Number : "+in);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("Enter the number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the number : ");
        int b = sc.nextInt();
        try {
            int res = a/b;
            System.out.println("Dision is sucessfully completed");
            System.out.println(res);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
