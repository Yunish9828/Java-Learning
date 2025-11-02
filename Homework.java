import java.util.Scanner;

public class Homework{
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print( "Enter first number:");
            int num1= scanner.nextInt();

            System.out.print("Enter second number:");
            int num2 = scanner.nextInt();

            System.out.print ("Enter third number :");
            int num3 = scanner.nextInt();

            if (num1 >= num2) {
                if (num1 >= num3) {
                System.out.println("The largest number is: " + num1);
                } else {
                System.out.println("The largest number is: " + num3);
                }
                } else if (num2 >= num3) {
                System.out.println("The largest number is: " + num2);
                } else {
                System.out.println("The largest number is: " + num3);

                
   }
   try (Scanner week = new Scanner (System.in)) {
}

   int weekdays = scanner.nextInt();

    switch(weekdays){

    case 1:
    System.out.println("Sunday");
    break;

    case 2:
    System.out.println("Monday");
    break;

    case 3:
    System.out.println( "Tuesday");
    break;

    case 4:
    System.out.println("Wednesday");
    break;

    case 5:
    System.out.println("Thursday");
    break;

    case 6:
    System.out.println("Friday");
    break;

    case 7:
    System.out.println("Saturday");
    break;

    default :
    System.out.println("Invalid number .Enter number from 1 to 8");
    break;
    }
        }
}
}
