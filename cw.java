import java.util.Scanner;
public class cw {
    public static void main(String[] args) {

        String[] name = new String[3];
        Scanner input = new Scanner(System.in);

        int [][] marks = new int[3][3];
        System.out.println("Enter the name ");
        System.out.println("Enter the marks");
        for (int i = 0; i < 3; i++) {
            name[i] = input.nextLine();
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the marks");
               marks[i][j] = input.nextInt();
            }
        }
    }
}
            