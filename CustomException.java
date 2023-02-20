import java.util.Scanner;

class InvaildAgeException extends Exception{
       public InvaildAgeException(String str){
        super(str);
       }
}

public class CustomException {
    public static void main(String[] args) throws InvaildAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("You can vote now --!");
        }else{
            throw new InvaildAgeException("You are under 18 not eligible for vote --!");
        }
    }
}
