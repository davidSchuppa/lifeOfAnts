public class Drone extends Ant {

    private static final int MATING_DISTANCE = 3;
    private static final int KICKAWAY_STEPS = 100;
    private int matingCounter;
    private Queen queen;
    private boolean isMating;

    public Drone(int positionX, int positionY, Queen queen) {
        super.setPositionX(positionX);
        super.setPositionY(positionY);
        this.queen = queen;
        matingCounter = 10;
        isMating = false;
    }

    public void setPositionX(){
        if(this.getPositionX() >= MATING_DISTANCE){
            super.setPositionX(-1);
        }
    }

    public void setPositionY(){
        if(this.getPositionY() >= MATING_DISTANCE){
            super.setPositionY(-1);
        }
    }


    @Override
    public void step() {
        if (getDistanceFrom(queen) <= MATING_DISTANCE){
            this.tryMating();
        } else {
            setPositionX();
            setPositionY();
        }
    }

    public void tryMating() {
        if (queen.isInMood() && matingCounter > 0){
            isMating = true;
            System.out.println("HALLELUJAH");
            matingCounter--;
        } else{
            kickAway();
        }
    }

    public void kickAway(){
        int newX = Colony.getRandom().nextInt(KICKAWAY_STEPS);
        int newY = KICKAWAY_STEPS - newX;
        setPositionX(newX);
        setPositionY(newY);
    }
}
