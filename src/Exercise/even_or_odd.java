package Exercise;
import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num;

        System.out.println("Enter a number: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
