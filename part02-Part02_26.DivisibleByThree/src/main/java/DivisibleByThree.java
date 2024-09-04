

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int lower, int higher){
        for (int i = lower; i <= higher; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

}
