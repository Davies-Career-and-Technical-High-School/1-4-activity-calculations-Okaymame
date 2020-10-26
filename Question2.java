
import java.util.Scanner; 
class Question2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number of inches and ill give you ft");

        int inches = scan.nextInt();
        System.out.println(inches/12);

    }
}