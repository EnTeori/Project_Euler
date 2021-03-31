public class SRP1 {

    private static int answer = 0; // not needed, private (this class), static (class variable)

    public static void main(String[] args) {

        int sum = 0;

        int multiples_of_three = 0;

        int multiples_of_five = 0;

        for (int i = 3; i < 100; i++) {
            multiples_of_three = multiples_of_three + i;
            i = i + 2;
        }

        for (int j = 5; j < 1000; j++) {
            multiples_of_five = multiples_of_five + j;
            j = j + 2;
        }

        sum = multiples_of_three + multiples_of_five;

        System.out.println(sum);
    }

    // not needed
    public int red(int a) {

        return a;

    }

    public int blue(int b) {
        return b;

    }
}