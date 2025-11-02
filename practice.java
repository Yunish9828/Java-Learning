import java.util.Scanner;
public class practice{
    public static void main(String[]args){


//         for(int i=1; i<=100; i++){
//             if(i%2 ==0){
//                 System.out.println(i);
//             }
//         }
//     }
// }


//         int sum = 0;
//         for(int i =1; i<= 100; i++){
//             if(i%2 == 0){
//                 sum += i;
//             }
//         }
//         System.out.println("The sum of the even numbers between 1 and 10 is: " + sum);
//             }
// }



// Scanner scanner = new Scanner(System.in);
// System.out.print("Enter a number: ");
// int number = scanner.nextInt();
// boolean isprime = true;
// if(number <=1){
//     isprime = false;
// }else{
//     for(int i = 2; i <= Math.sqrt(number); i++){
//         if(number % 2 == 0) {
//             isprime = false;
//             break;
//         }
//     }
// }
// if(isprime){
//     System.out.println("The given number is a prime number");
// }
// else{
//     System.out.println("The number is a composite number");
// }
// }
// }


// int[]numbers = new int[5];
// Scanner input = new Scanner(System.in);
// for(int i = 0; i<5; i++){
//     System.out.print("Enter number for index" + i + ": " );
//     numbers[i]= input.nextInt();
// }
// for(int i = 0; i<5; i++){
//     System.out.println(numbers[i]);
// }


int [][] numbers = new int[3][2];
Scanner input = new Scanner(System.in);

for(int i=0;i<3;i++){

    for(int j=0;j<2;j++){
        System.out.print("Enter numbers: ");
        
        numbers[i][j]= (input.nextInt());
    }
}

for (int i = 0;i<3;i++){

    for(int j=0;j<2;j++){
        System.out.println(numbers[i][j]);
    }
}
System.out.println();
    }
}


