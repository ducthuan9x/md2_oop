package Point;

public class Point3D extends Point2D {
    public float z=0;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[]{super.getX(),super.getY(),getZ()};
    }
    public void setXYZ(float x,float y,float z){
        this.z =z;
        super.setXY(x,y);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", " +super .toString() +
                '}';
    }
}
