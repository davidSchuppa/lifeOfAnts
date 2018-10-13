public class Drone extends Ant {

    private static final int MATING_DISTANCE = 3;
    private static final int KICKAWAY_STEPS = 10;
    private int matingCounter;
    private Queen queen;

    public Drone(int positionX, int positionY, Queen queen) {
        super.setPositionX(positionX);
        super.setPositionY(positionY);
        this.queen = queen;
    }

    public void setPositionX(){
        if(this.getPositionX() >= MATING_DISTANCE){
            super.setPositionX(-1);
        } else {
            super.setPositionX(1);
        }
    }

    public void setPositionY(){
        if(this.getPositionY() + this.getPositionX() >= MATING_DISTANCE){
            super.setPositionY(-1);
        } else {
            super.setPositionY(1);
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
        if (queen.isInMood()){
            System.out.println("HALLELUJAH");
            this.matingCounter = 10;
            queen.setInMood(false);
            matingCounter--;
        } else if (matingCounter > 0){
            matingCounter--;
        }
        else if (matingCounter == 0){
            kickAway();
        }
        else{
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
