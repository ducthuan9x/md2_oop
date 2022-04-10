package MoveablePoint;

public class Moveable extends Point {
    private float xSpeed=0;
    private  float ySpeed=0;

    public Moveable() {

    }

    public Moveable(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public float[] getSPeed(float xSpeed,float ySpeed){
        return new float[]{getXSpeed(),getYSpeed()};
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "Moveable{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                "," + super.toString() +
                '}';
    }
    public Moveable Move(){
      super.setX(getX()+getXSpeed());
      super.setY(getY()+getYSpeed());
      return this;
    }


}
