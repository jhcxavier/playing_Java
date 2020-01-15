import java.util.Random;
public class Dice {

    public final static int ONE = 0;
    public final static int TWO = 1;
    public final static int THREE = 2;
    public final static int FOUR = 3;
    public final static int FIVE = 4;
    public final static int SIX = 5;

    private int diceSide;

    public Dice(){
        rollDice();
    }

    public void rollDice(){
        Random rand = new Random();
        diceSide = rand.nextInt(6);
    }

    public String getDiceResult(){
        if(diceSide == ONE){
            return "1";
        }else if(diceSide == TWO){
            return "2";
        }else if(diceSide == THREE){
            return "3";
        }else if(diceSide == FOUR){
            return "4";
        }else if(diceSide == FIVE){
            return "5";
        }else if(diceSide == SIX){
            return "6";
        }else{
            return "Invalid";
        }
    }


}
