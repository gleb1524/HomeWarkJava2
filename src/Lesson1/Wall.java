package Lesson1;

public class Wall implements Let{

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public Wall(){
        this(2);
    }

    @Override
    public boolean overcom(Сompeting move) {
        if(move.jump(height)){
            return true;
        }else return false;
    }
}
