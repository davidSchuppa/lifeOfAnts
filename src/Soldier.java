public class Soldier extends Ant {

    private Direction[] directions = Direction.values();
    private int directionCounter;


    public Soldier(int positionX, int positionY) {
        super(positionX, positionY);
        this.directionCounter = 0;
    }

    public void step() {
        directionCounter++;
        patrol();
    }

    public void patrol() {
        if (directionCounter > 4) {
            directionCounter = 1;
        }
        setPositionX(directions[directionCounter - 1]);
        setPositionY(directions[directionCounter - 1]);
    }

    public void setPositionX(Direction coordinates) {
        super.setPositionX(coordinates.getValue()[0]);
    }

    public void setPositionY(Direction coordinates) {
        super.setPositionY(coordinates.getValue()[1]);
    }


}
