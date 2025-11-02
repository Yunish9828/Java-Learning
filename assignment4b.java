public class assignment4b {
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
