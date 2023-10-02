import java.util.Scanner;
public class Main {

    public static boolean PrimeChecker(int number){
        int counter = 0;
        if (number>1){
            for (int i = 2; i < number ; i++){
                if (number%i == 0) {
                    counter++;
                }
            }
        } else return false;
        if (counter == 0) return true;
        else return false;
    }
    public static void PrintPrime(int number1 ){
        for (int i = 1;i<number1;i++){
            if (PrimeChecker(i)) System.out.println(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter What do you want to do: ");
        System.out.println("1. Check if a number is prime or not\n2.Get the prime numbers till N\n3.Distance of 2 points");
        byte choice = scan.nextByte();
        switch (choice){
            case 1: //Prime or not
                System.out.println("Enter a number: ");
                int number = scan.nextInt();
                if(PrimeChecker(number)){
                    System.out.println("It's a prime number");
                } else System.out.println("Not a Prime number");
                break;
            case 2://print all the prime numbers till N
                System.out.println("Enter a number: ");
                int number1 = scan.nextInt();
                PrintPrime(number1);
                break;
            case 3://distance of two points
                double x,y;
                System.out.println("Enter 1st Point");
                System.out.println("X1 = ");
                x = scan.nextDouble();
                System.out.println("Enter Y1: ");
                y = scan.nextDouble();
                Point p1 = new Point(x,y);
                System.out.println("Enter 2nd Point: ");
                System.out.println("X2: ");
                x = scan.nextDouble();
                System.out.println("Y2: ");
                y = scan.nextDouble();
                Point p2 = new Point(x,y);
                System.out.println("Distance: "+Point.distance(p1,p2));
        }
    }
}