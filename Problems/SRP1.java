public class SRP1 {

    private static int answer = 0; // not needed, private (this class), static (class variable)

    public static void main(String[] args) {

        int sum = 0;

        int multiples_of_three = 0;

        int multiples_of_five = 0;

        for (int i = 3; i < 1000; i = i + 3) {
            multiples_of_three = multiples_of_three + i;

        }

        for (int j = 5; j < 1000; j = j + 15) {

            for (int k = j; k < j + 6; k = k + 5) {

                multiples_of_five = multiples_of_five + k;
            }

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