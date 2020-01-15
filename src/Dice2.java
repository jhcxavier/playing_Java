import java.util.Random;

public class Dice2 {
    Random rand;
    int previousDice = -1;
    public Dice2(){
        this.rand = new Random();
    }

    public int roll(){
        int currentRoll = this.rand.nextInt(6)+1;
        this.previousDice = currentRoll;
        return currentRoll;
    }

}
