public abstract class Ant {

    private int positionX;
    private int positionY;


    public Ant() {
    }

    public Ant(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public abstract void step();

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX += positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY += positionY;
    }


    public int getDistanceFrom(Ant otherAnt) {
        int distance = Math.abs(otherAnt.positionX - this.getPositionX()) + Math.abs(otherAnt.positionY - this.getPositionY());
        return distance;
    }

}
