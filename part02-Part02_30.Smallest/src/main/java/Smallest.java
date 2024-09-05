
public class Smallest {

    public static int smallest(int number1, int number2) {
        int smaller = number1;

        if (smaller > number2) {
            smaller = number2;
        }

        return smaller;
    }

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }
}
