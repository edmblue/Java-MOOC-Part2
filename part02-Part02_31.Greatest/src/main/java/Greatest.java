
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greater = number1;

        if (greater < number2 && number2 > number3) {
            greater = number2;
        } else if (greater < number3 && number3 > number2) {
            greater = number3;
        }

        return greater;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
