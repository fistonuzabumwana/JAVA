package Exercise;
import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, product;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        for (int i = 1; i<=20; i++){
            product = num * i;
            System.out.println(num+" * "+i+" = "+product);
        }

    }
}
