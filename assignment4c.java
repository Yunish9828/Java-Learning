public class assignment4c {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int num = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                numbers[num] = i;
                num++;
            }
        }

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + numbers[i];
        }

        int average = sum / num;
        System.out.println("Average = " + average);
        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.println((average - numbers[i]));
            System.out.println();
        }
        
    }
}
