public class Spider extends Insect {
    boolean isPoisonous;

    public Spider(int age, boolean isPoisonous){
        super(age, 8);

        //Here we give to isPoisonous an input value;
        this.isPoisonous = isPoisonous;
    }
    public void says(){
        System.out.println("HISSS");
    }
}
