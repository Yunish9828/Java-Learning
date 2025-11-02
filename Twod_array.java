import java.util.Scanner;
public class Twod_array {
    public static void main(String [] args){
        int [][] numbers = new int[3][2];
        Scanner input = new Scanner(System.in);

        for(int i=0;i<3;i++){

            for(int j=0;j<2;j++){
                System.out.print("Enter numbers");
                
                numbers[i][j]= (input.nextInt());
            }
        }

        for (int i = 0;i<3;i++){

            for(int j=0;j<2;j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
