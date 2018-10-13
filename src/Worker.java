public class Worker extends Ant {
    private Direction[] directions = Direction.values();

    public Worker(int positionX, int positionY) {
        super(positionX, positionY);
    }

    public Direction getRandomDirection(){
        int randomInt = Colony.getRandom().nextInt(directions.length);
        System.out.println("random direction: " + directions[randomInt]);
        return directions[randomInt];
    }

    public void step(){
        /* integer array with [0] index X value, [1] index Y value */
        int[] xyDirections = getRandomDirection().getValue();
        super.setPositionX(xyDirections[0]);
        super.setPositionY(xyDirections[1]);
        System.out.println("worker is marching somewhere");
    }

}
