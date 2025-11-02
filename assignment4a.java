import java.util.Scanner;
public class assignment4a {
    public static void main(String[] args) {
                int[]numbers = new int[5];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<5; i++){
            System.out.print("Enter number for index" + i + ": " );
            numbers[i]= input.nextInt();
        }
        for(int i = 0; i<5; i++){
            System.out.println(numbers[i]);
        }

    }
}


