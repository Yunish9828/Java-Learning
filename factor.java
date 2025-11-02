import java.util.Scanner;
public class factor {
    public static void main(String[]args){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();
        System.out.println("The factorial is: " + fact(num));
    }
    static  long fact (int num){
        if(num == 1){
            return 1;
        }
        return num * fact(num -1);
    }
}
