public class Cylinder extends Shape{
    private final double radius;
    public final double height;

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea(){
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume(){
        return Math.PI *radius * radius * height;
    }

    @Override
    public String toString(){
        return String.format("Cylinder\nRadius = %.2f\nHeight = %.2f\nSurface Area = %.2f\nVolume =%.2f\n",  radius, height, surfaceArea(), volume());
    }
}