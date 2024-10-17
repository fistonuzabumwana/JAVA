package Lecture5;

public class Exception1 {
    public static void main(String[] args) {
        int[] age ={20,30,35,40,50};

        try{
        System.out.println(age[6]);
    } catch (Exception e) {
        throw new ArrayIndexOutOfBoundsException("out of bound");
        }
    }
}
