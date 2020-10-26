 import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("enter a price");
        double cost = scan.nextDouble();
        System.out.println("change from $20: $"+ (20-cost));

    }
}