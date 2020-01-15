import java.util.Random;
    // Coin class represents a coin
public class Coin {

    //Here are the 2 sides of a coin represented by 0 and 1
    public final static int HEADS = 0;
    public final static int TAILS = 1;

    //the face up keep's track of what the coin is facing up
    // if we flip and the faceUp is HEAD, the faceUp will be 0;
    private int faceUp;

    //Here we have the constructor and this allows the coin start with
    // HEAD or TAILS
    public Coin(){
        flip();
    }

    // this is simulating flipping a coin with the random number generator
    public void flip(){
        Random rand = new Random();
        faceUp = rand.nextInt(2);
    }

    //
    public String getFaceUp(){
        if(faceUp == 1){
            return "Tails";
        }else if(faceUp == 0){
            return "Head";
        }else{
            return "Invalid";
        }
    }

}
