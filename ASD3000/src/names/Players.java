package names;

/**
 * Created by Odin on 2/15/2017.
 */
public enum Players {
    NORTHPLAYER(-1), SOUTHPLAYER(1);

    private final int moveDir;

    Players(int moveDir) {
        this.moveDir = moveDir;
    }

    public int getMoveDir() {
        return moveDir;
    }
}
