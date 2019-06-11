package dev.gloomyfox.pattern.creation.origin;

public class Room extends MapSite {

    private int roomNo;
    private MapSite[] sides;

    public Room(int roomNo) {
        this.roomNo = roomNo;
        sides = new MapSite[4];
    }

    @Override
    public void enter() {
        System.out.println("Enter Room");
    }

    public void setSide(Direction direction, MapSite mapSite) {
        sides[direction.ordinal()] = mapSite;
    }

    public MapSite getSide(Direction direction) {
        return sides[direction.ordinal()];
    }
}
