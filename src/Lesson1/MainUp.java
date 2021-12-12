package Lesson1;

public class MainUp {
    public static void main(String[] args) {

        Сompeting[] competings = {
                new Human(2000, 3),
                new Cat(4000, 6),
                new Robo(200, 1),
                new Cat(3500, 5),
                new Human(900, 1)
        };

        Let[] lets = {
                new Wall(3),
                new Treadmill(3000),
                new Wall(),
                new Treadmill()
        };

        for (int i = 0; i < competings.length; i++) {
            for (int j = 0; j < lets.length; j++) {
                if(!lets[j].overcom(competings[i])){
                    break;
                }
            }
        }


    }
}
