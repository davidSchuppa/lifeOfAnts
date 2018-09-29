import java.util.Arrays;

public class Ant {

    private String name;
    private int positionX;
    private int positionY;
    private int[] startingPosition;
    private static int[] queenPosition = {0, 0};
    private static boolean isThereAWasp = false;


    public Ant() {
    }

    public Ant(String name, int positionX, int positionY, int[] startingPosition) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.startingPosition = startingPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int[] getStartingPosition() {
        return startingPosition;
    }
}
