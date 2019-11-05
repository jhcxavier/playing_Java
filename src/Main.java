import java.awt.*;

public class Main{

    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Joao");

        Car myCar = new Car(25.5,
                            "1BC453",
                             Color.BLUE, true);
        Car sallyCar = new Car(13.9,
                "35DG45",
                Color.BLACK,
                false );
        System.out.println("My car is License Plate: " + myCar.licensePlate);
        System.out.println("My car is License Plate: " + sallyCar.licensePlate);
        System.out.println(myCar.paintColor.toString());
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor.toString());
    }
}
