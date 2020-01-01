public class Dog extends Animal {

    public Dog(String name , int runLimit, double jumpLimit, int swimLimit){
        super ("Собака  " + name);
        this.runLimit=runLimit;
        this.jumpLimit= jumpLimit;
        this.swimLimit= swimLimit;

    }
}
