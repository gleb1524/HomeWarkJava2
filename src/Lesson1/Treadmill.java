package Lesson1;

public class Treadmill implements Let{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public Treadmill() {
        this(1000);
    }

    @Override
    public boolean overcom(Сompeting move) {
        if(move.run(distance)){
            return true;
        }else return false;
    }
}

