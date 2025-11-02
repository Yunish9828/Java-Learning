import java.util.Scanner;
public class prime_r {
    public static void main(String[] args){
        int n1;
        int n2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n1 = input.nextInt();
        System.out.println("Enter another number: ");
        n2 = input.nextInt();
        check_prime(n1, n2);
        input.close();

    }

    static void check_prime(int n1, int n2) {

        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}