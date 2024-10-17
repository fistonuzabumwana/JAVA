package Lecture5;

public class Exception3 {
    public static void main(String[] args) {
        int[] a ={2,7,9,12};
        try {
            System.out.println("Access element five: "+a[5]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Thrown: "+ e);
        }
        finally {
            System.out.println(a[2]);
        }
}
}
