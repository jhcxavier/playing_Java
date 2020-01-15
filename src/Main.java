import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

import static java.lang.reflect.Array.*;

public class Main{

    public static void main(String[] args){

        Coin c = new Coin();
        System.out.println("Initial: " + c.getFaceUp());

        for(int i = 0; i < 10; i++) {
           c.flip();
           System.out.println("After Flip: " + c.getFaceUp());
        }




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