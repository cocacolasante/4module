public class Sphere extends Shape{
    private final double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double surfaceArea(){
        return 4 * Math.PI * (radius *radius);
    }

    @Override
    public double volume(){
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString(){
        return String.format("Sphere\nRadius = %.2f\nSurface Area = %.2f\nVolume =%.2f\n",  radius, surfaceArea(), volume());
    }
    
}