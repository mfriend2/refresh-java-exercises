public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myFavoriteNumber = 2;
        String myString = "This is my string.";
        System.out.println(myFavoriteNumber);
        System.out.println(myString);
        int x = 5;
        while (x <= 15) {
            System.out.println(x);
            x++;
        }
        int i = 2;
        do {
            System.out.println(i);
            int square = (int) Math.pow(i, 2);
            i = square;
        } while (i < 1000000);
        for (int n = 1; n <= 100; n++) {
            if (n % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (n % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (n % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(n);
            }
        }
    }
}