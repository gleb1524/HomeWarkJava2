package Lesson1;

public class Robo implements Сompeting{

    private int maxRun;
    private int maxJump;

    public Robo(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public Robo(){
        this(100, 0);
    }

    @Override
    public boolean jump(int dist) {
        if(dist <= maxJump){
            System.out.println("Робот прыгнул на " + dist + " м.");
            return true;
        }else {
            System.out.println("Робот не смог прыгнуть на " + dist + " м.");
            return false;
        }
    }

    @Override
    public boolean run(int dist) {
        if(dist <= maxRun){
            System.out.println("Робот пробежал " + dist + " м.");
            return true;
        }else {
            System.out.println("Робот не смог пробежать " + dist + " м.");
            return false;
        }
    }

}

