import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Colony {
    private static final int STEPS = 200;
    private static int INSTANCES = 3;
    private int xGrid;
    private int yGrid;
    private static Random random = new Random();
    private Queen queen;
    private boolean isThereAWasp = false;

    private List<Ant> ants = new ArrayList<Ant>();

    public Colony(int xGrid, int yGrid) {
        this.xGrid = xGrid;
        this.yGrid = yGrid;
        this.queen = new Queen();
        initAnts();
    }

    public static int getSTEPS() {
        return STEPS;
    }

    public static Random getRandom() {
        return random;
    }

    public int getxGrid() {
        return xGrid;
    }

    public int getyGrid() {
        return yGrid;
    }

    public void initAnts(){
        for(int i = 0; i < INSTANCES; i++){
            ants.add(new Drone(random.nextInt(xGrid), random.nextInt(yGrid), queen));
        }
        ants.add(queen);
    }

    public List<Ant> getAnts() {
        return ants;
    }
}
