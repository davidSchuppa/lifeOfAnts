import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating Ant Colony");
        Colony colony = new Colony(10,10);

        List<Ant> ants = colony.getAnts();

        for(Ant ant : ants){
            System.out.println("Drone position x: " +ant.getPositionX() +
                    ", position y: " + ant.getPositionY());
        }


    }

    public static void init(){
//        Direction dir = Direction.WEST;
//        System.out.println(Arrays.toString(dir.getValue()));
    }
}
