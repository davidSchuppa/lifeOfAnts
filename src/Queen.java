public class Queen extends Ant{
    private final int posX = 0;
    private final int posY = 0;
    private boolean isInMood;

    public Queen() {
        this.isInMood = true;
    }

    public boolean isInMood() {
        return isInMood;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    @Override
    public void step() {
        System.out.println("standing still");
    }


//    public void tryMating(){
//        System.out.println("I'm trying!!!");
//    }
}
