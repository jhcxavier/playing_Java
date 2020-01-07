import java.awt.*;

public class Main{

    public static void main(String[] args){
        String userInput = "entertainment";
        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);

        char firstCharater = uppercased.charAt(0);
        System.out.println(firstCharater);

        System.out.println("Contains: " +
                userInput.contains("Enter".toLowerCase()));
    }
}