package Point;

public class Point2D {
    public float x=0;
    public float y=0;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{getX(),getY()};
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y ;

    }
}
