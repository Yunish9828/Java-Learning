// Arrays

// import java.util.Scanner;

// public class day4 {
//     public static void main(String[] args) {
//         int[]numbers = new int[5];
//         Scanner input = new Scanner(System.in);
//         for(int i = 0; i<5; i++){
//             System.out.print("Enter number for index" + i + ": " );
//             numbers[i]= input.nextInt();
//         }
//         for(int i = 0; i<5; i++){
//             System.out.println(numbers[i]);
//         }

//     }

// }

public class day4 {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int y = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                numbers[y] = i;
                y++;
            }
        }

        for (int i = 0; i <= 50; i++) {
            System.out.println(numbers[i]);
        }

    }
}
