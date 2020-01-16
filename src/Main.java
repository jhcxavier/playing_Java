import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static java.lang.reflect.Array.*;

public class Main{

    public static void main(String[] args){

        Dog2 d = new Dog2();
        Cat c = new Cat();

        if(c instanceof Pet){
            c.play();
        }
        if (d instanceof Pet) {
            d.play();
        }

        Pet p;
        Random rand = new Random();
        int n = rand.nextInt(2);

        if(n == 0){
            p = new Dog2();
        }else{
            p = new Cat();
        }
        p.play();


//        Insect insect = new Insect(5, 6);
//        Spider spider = new Spider(13, true);
//        Cricket cricket = new Cricket(4, 12.4);
//
//        insect.crawl();
//        insect.says();
//
//        spider.crawl();
//        spider.says();
//
//        cricket.crawl();
//        cricket.says();
//        cricket.jump();
//
//        if(spider instanceof Insect && spider instanceof Spider){
//            System.out.println("Spider is an insect and Spider");
//        }


//        BankAccount myBankAccount = new BankAccount(4141, 100);
////        System.out.println(myBankAccount);
//        myBankAccount.deposit(-60);
//        myBankAccount.withdraw(150);
//
//        myBankAccount.deposit(100);
//        myBankAccount.withdraw(200);




//        Dice2 dice = new Dice2();
//        System.out.println("Previous roll: "+ dice.previousDice);
//        System.out.println(dice.roll());
//        System.out.println("Previous roll: "+ dice.previousDice);
//        System.out.println(dice.roll());
//        System.out.println("Previous roll: "+ dice.previousDice);

//        Dice c = new Dice();
//        Scanner in = new Scanner(System.in);
//        for(int i =0; i>1; i++) {
//            c.flip();
//        System.out.println("Dice 1 " + c.getFaceUp());
//
//        }
//        for(int j =0; j>1; j++) {
//            c.flip();
//            System.out.println("Dice 2 " + c.getFaceUp());
//        }


//        for(int i = 0; i < 1; i++) {
//           c.rollDice();
//           System.out.println("Dice 1: " + c.getDiceResult());
//
//           c.rollDice();
//           System.out.println("Dice 2: " + c.getDiceResult());
////        }




//        //exponential number
//        double power = Math.pow(5, 3);
//        System.out.println(power);
//
//        //square root
//        double squareRoot = Math.sqrt(64);
//        System.out.println(squareRoot);
//
//        // create a random number
//        Random rand = new Random();
//        int randomNumber = rand.nextInt();
//        int randomNUmberWithBound = rand.nextInt(10);
//        System.out.println(randomNumber);
//        System.out.println(randomNUmberWithBound);

//        //For Loop
//        System.out.println("FOR LOOP");
//        int i;
//        for( i = 3; i > 0; i--){
//            System.out.println("Current i: " + i);
//        }
//        System.out.println(i);
//        System.out.println();
        //Do-While Loop
//        System.out.println("Do-While Loop");
//        int y = 3;
//        do{
//            System.out.println("Current y: " + y);
//            y = y - 1;
//        }
//        while(y > 0);
//        System.out.println("Final y: " + y);
//        System.out.println();

        //While Loop
//        System.out.println("While Loop");
//        int x = 3;
//        while(x > 0){
//            System.out.println("Current x: "+ x);
//            x = x -1;
//        }
//        System.out.println("Final x: " + x);





        //Conditional statement
//        System.out.println("Enter an age: ");
//        Scanner in = new Scanner(System.in);
//        int age = in.nextInt();
//
//        if(age >= 0 && age <= 5){
//            System.out.println("Baby");
//        }
//        else if(age > 5 && age < 11){
//            System.out.println("Kid");
//        }
//        else if(age >= 11 && age < 18){
//            System.out.println("Teenage");
//        }
//        else if(age >= 18){
//            System.out.println("Adult");
//        }else{
//            System.out.println("Invalid");
//        }
//
//        System.out.println("Thank you for using this program");


//        String s = "dog";
//        String replacedF = s.replace('d', 'f');
//        System.out.println(replacedF);
//        Dog myDog = new Dog(
//                "Big",
//                "Labrador",
//                false,
//                Color.yellow,
//                3);
//
//        myDog.bark();
//        int dogAge = myDog.getDogYears();
//        System.out.println(dogAge + " dog years old");
//        myDog.fetch();
//        myDog.fetch();
//        myDog.fetch();
//        myDog.fetch();
//
//        System.out.println("The dog size is: "+myDog.size);
//        System.out.println("Is the dog dangerous? "+myDog.dangerousDog);
//        System.out.println("The dog color is: "+ myDog.dogColor.toString());




        //    // 31, 45, 22, 98, 10
//        int [] numbers = new int[5];
//        numbers[0]=31;
//        numbers[1]=45;
//        numbers[2]=22;
//        numbers[3]=98;
//        numbers[4]=10;
//
//        int[]numbers2 = {31, 45, 22, 98, 10};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
//        System.out.println("Index 1: "+ myFavoriteCandyBars[1]);
//        myFavoriteCandyBars[2]= "Butterfinger";
//        System.out.println("Index2: "+myFavoriteCandyBars[2]);
//        System.out.println("Length: "+myFavoriteCandyBars.length);
//
//        System.out.println(get(myFavoriteCandyBars, 2));
//




//      // System.out.println("Enter a word:");
//        Scanner sc = new Scanner(System.in);
//        int userNumber = sc.nextInt();
//        System.out.println(userNumber);
//        double userNumber2 = sc.nextDouble();
//        System.out.println(userNumber2);
///*
//        String userInput = sc.next();
//        String uppercased = userInput.toUpperCase();
//        System.out.println(userInput);
//        System.out.println(uppercased);
//
//        char firstCharater = uppercased.charAt(0);
//        System.out.println(firstCharater);
//
//        System.out.println("Contains: " +
//                userInput.contains("Enter".toLowerCase()));
//                */

    }
}