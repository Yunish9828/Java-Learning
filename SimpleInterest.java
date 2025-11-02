import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        float principal, rate, time, interest;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal");
        principal = input.nextFloat();
        System.out.println("Enter rate");
        rate = input.nextFloat();
        System.out.println("Enter time");
        time = input.nextFloat();
        System.out.println("The simple interest is "+ (Simpleinterest(principal,rate,time)));
    }
    static float Simpleinterest(float principal,float rate, float time){
    float result;
    result = ((principal*rate*time))/100;
    return result;
}
}

