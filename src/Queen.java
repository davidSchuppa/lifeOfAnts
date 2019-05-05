public class Queen extends Ant{
    private final int posX = 0;
    private final int posY = 0;
    private boolean isInMood;
    private int matingTimer;
    private int TIMER_HIGH_VALUE;
    private int TIMER_LOW_VALUE;

    public Queen() {
        this.isInMood = false;
        this.TIMER_HIGH_VALUE = 10;
        this.TIMER_LOW_VALUE = 1;
        this.matingTimer = TIMER_HIGH_VALUE;
    }

    public boolean isInMood() {
        return isInMood;
    }

    @Override
    public void step() {
        matingTimer--;
        if(matingTimer == 0){
            setInMood(true);
            setMatingTimer();
        }
    }

    public void setInMood(boolean bool){
        this.isInMood = bool;
    }

    public void setMatingTimer() {
        int randInt = Colony.getRandom().nextInt(TIMER_HIGH_VALUE - TIMER_LOW_VALUE) + TIMER_LOW_VALUE;
        this.matingTimer = randInt;
    }
}
