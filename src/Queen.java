public class Queen extends Ant{
    private final int posX = 0;
    private final int posY = 0;
    private boolean isInMood;
    private int matingtTimer;
    private int TIMER_HIGH_VALUE;
    private int TIMER_LOW_VALUE;

    public Queen() {
        this.isInMood = false;
        this.TIMER_HIGH_VALUE = 10;
        this.TIMER_LOW_VALUE = 1;
        this.matingtTimer = TIMER_HIGH_VALUE;
    }

    public boolean isInMood() {
        return isInMood;
    }

//    public int getPosX() {
//        return posX;
//    }
//
//    public int getPosY() {
//        return posY;
//    }

    @Override
    public void step() {
        matingtTimer--;
        if(matingtTimer == 0){
            setInMood(true);
            setMatingtTimer();
        }
    }

    public void setInMood(boolean bool){
        this.isInMood = bool;
    }

    public void setMatingtTimer() {
        int randInt = Colony.getRandom().nextInt(TIMER_HIGH_VALUE - TIMER_LOW_VALUE) + TIMER_LOW_VALUE;
        System.out.println(randInt);
        this.matingtTimer = randInt;
    }

    //    public void tryMating(){
//        System.out.println("I'm trying!!!");
//    }
}
