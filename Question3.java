import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in); 
        System.out.println("enter a radius");
        int rad = scan.nextInt();
        System.out.println("circumfrance: "+ (2*3.14*rad));
        System.out.println("Area: " + (3.14*rad*rad));



    }
}