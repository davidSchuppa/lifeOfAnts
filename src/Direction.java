public enum Direction {
    NORTH(0,1),
    EAST(1,0),
    SOUTH(0,-1),
    WEST(-1,0);

    private final int x;
    private final int y;

    Direction(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int[] getValue(){
        int[] values = new int[2];
        values[0] = x;
        values[1] = y;
        return values;
    }

}
