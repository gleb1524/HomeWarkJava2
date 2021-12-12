package Lesson1;

public class Human implements Сompeting{

    private int maxRun;
    private int maxJump;

    public Human(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public Human(){
        this(1000, 2);
    }

    @Override
    public boolean jump(int dist) {
        if(dist <= maxJump){
            System.out.println("Человек прыгнул на " + dist + " м.");
            return true;
        }else {
            System.out.println("Человек не смог прыгнуть на " + dist + " м.");
            return false;
        }
    }

    @Override
    public boolean run(int dist) {
        if(dist <= maxJump){
            System.out.println("Человек пробежал " + dist + " м.");
            return true;
        }else {
            System.out.println("Человек не смог пробежать " + dist + " м.");
            return false;
        }
    }
}