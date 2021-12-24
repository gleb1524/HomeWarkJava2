package Lesson1;

public class Cat implements Сompeting{

    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }
    public Cat(){
        this(3000, 5);
    }

    @Override
    public boolean jump(int dist) {
        if(dist <= maxJump){
            System.out.println("Кот прыгнул на " + dist + " м.");
            return true;
        }else {
            System.out.println("Кот не смог прыгнуть на" + dist + " м.");
            return false;
        }
    }

    @Override
    public boolean run(int dist) {
        if(dist <= maxRun){
            System.out.println("Кот пробежал " + dist + " м.");
            return true;
        }else {
            System.out.println("Кот не смог пробежать " + dist + " м.");
            return false;
        }
    }

}
