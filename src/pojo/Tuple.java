package pojo;

public class Tuple {

    public int x;
    public int y;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void ChangeData(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // &begin[Update]
    public int getX() {
        return x;
    }
    // &end[Update]

    public int getY() {
        return y;
    }

} 