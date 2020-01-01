public abstract class Animal {

    protected String name;
    protected int runLimit;
    protected int swimLimit;
    protected double jumpLimit;



    public Animal(String name) {
        this.name = name;
    }


    public void run(int distance) {

        if (runLimit > 0 && runLimit >= distance) {
            System.out.println(this.name  + "  пробежал " + distance + "  метров");
        } else {
            System.out.println(this.name + "  не может столько пробежать");
        }

    }

    public void jump(int distance) {
        if (jumpLimit > 0 && jumpLimit >= distance) {
            System.out.println(this.name + "  прыгнул на" + distance + "метров");
        } else {
            System.out.println(this.name + "  не может прыгнуть так высоко");
        }

    }

    public void swim(int height) {
        if (swimLimit > 0 && swimLimit >= height) {
            System.out.println(this.name   + "  проплыл  " +  height + "  метров");
        } else {
            System.out.println(this.name  + "  не может проплыть столько метров");
        }

    }
}