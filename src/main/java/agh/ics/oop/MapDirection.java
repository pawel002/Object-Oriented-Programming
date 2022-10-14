package agh.ics.oop;

public enum MapDirection {

    NORTH, SOUTH, EAST, WEST;

    @Override
    public String toString(){
        return super.toString();
    }

    public MapDirection next(){
        return switch(this) {
            case NORTH -> EAST;
            case SOUTH -> WEST;
            case EAST -> SOUTH;
            case WEST -> NORTH;
        };
    }

    public MapDirection previous(){
        return switch(this) {
            case NORTH -> WEST;
            case SOUTH -> EAST;
            case EAST -> NORTH;
            case WEST -> SOUTH;
        };
    }

    public Vector2d UnitVector(){
        return switch(this) {
            case NORTH -> new Vector2d(0, 1);
            case SOUTH -> new Vector2d(0, -1);
            case EAST -> new Vector2d(1, 0);
            case WEST -> new Vector2d(-1, 0);
        };
    }
}