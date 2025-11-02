import java.util.Scanner;

public class Hw {
    public static void main(String[] args){
for(int i = 1; i<=100; i++){
    if(i%2 ==0){
        System.out.println(i);
    }
}

int sum =0;
for(int i = 1; i<=100;i++){
    if(i%2==0){
        sum +=i ;
     
    }
    System.out.println("Sum of even numbers between 1 and 100: " + sum);
}

 Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a composite number.");
        }
}
    }

