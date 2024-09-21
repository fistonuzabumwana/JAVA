package Exercise;

public class divisible_by_3 {
    public static void main(String[] args) {

        System.out.println("Numbers between 1 to 50 which are divisable by 3:");

        for (int i = 0; i < 50; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
