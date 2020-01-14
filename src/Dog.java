import java.awt.*;

public class Dog {
    String size;
    String dogBread;
    Boolean dangerousDog;
    String [] fetchedItems = {"bone", "ball", "stick"};
    Color dogColor;
    int age;
    private int fetchCounter;

    public Dog(String theDogSize,
               String theDogBread,
               Boolean isTheDogDangerous,
               Color theDogColor,
               int theAge) {
        this.size = theDogSize;
        this.dogBread = theDogBread;
        this.dangerousDog = isTheDogDangerous;
        this.dogColor = theDogColor;
        this.age = theAge;


        if(isTheDogDangerous == false) isTheDogDangerous = Boolean.valueOf("No");
        else {
            isTheDogDangerous = Boolean.valueOf("Yes");
        }
    }
    public void bark(){
        System.out.println("bark");
    }
    public int getDogYears(){
        // Assume 1 year do is 7 human years
        return this.age * 7;
    }
    public void fetch(){
        this.fetchCounter = (this.fetchCounter + 1) % 3;
        String item = this.fetchedItems[this.fetchCounter];
        System.out.println("The " + dogBread + " fetched a " + item +".");
    }
}
