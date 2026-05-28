import java.util.*;

public class PairofDice {

    int d1, d2;

    // Constructor
    public PairofDice() {
        d1 = (int)(Math.random() * 6) + 1;
        d2 = (int)(Math.random() * 6) + 1;
    }

    public void roll() {
        d1 = (int)(Math.random() * 6) + 1;
        d2 = (int)(Math.random() * 6) + 1;
    }

    public int getFirstDice() {
        return d1;
    }

    public int getSecondDice() {
        return d2;
    }

    public int getTotal() {
        return d1 + d2;
    }

    public static void main(String[] args) {

        PairofDice dice = new PairofDice();

        int total = dice.getFirstDice() + dice.getSecondDice();
        int count = 0;

        while (total != 2) {

            dice.roll();

            total = dice.getFirstDice() + dice.getSecondDice();

            count++;

            System.out.println(count + " " + total);
        }

        System.out.println("Finished after " + count + " rolls");
    }
}
