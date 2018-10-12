import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colony {
    private static final int STEPS = 8;
    private static int INSTANCES = 3;
    private int xGrid;
    private int yGrid;
    private int queensPosX;
    private int queensPosY;
    private static Random random = new Random();
    private boolean isThereAWasp = false;

    private List<Ant> ants = new ArrayList<Ant>();

    public Colony(int xGrid, int yGrid) {
        this.xGrid = xGrid;
        this.yGrid = yGrid;
        initAnts();
    }

    public void initAnts(){
        for(int i = 0; i < INSTANCES; i++){
            ants.add(new Drone(random.nextInt(xGrid), random.nextInt(yGrid)));
        }
        ants.add(new Queen());
    }

    public List<Ant> getAnts() {
        return ants;
    }
}
