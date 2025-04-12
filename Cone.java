public class Cone extends Shape{

    private final double radius;
    public final double height;

    public Cone(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surfaceArea(){
        return Math.PI * radius *( radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    public double volume(){
        return (1.0/3.0) * Math.PI * radius * radius *height;
    }

    @Override
    public String toString(){
        return String.format("Cone\nRadius = %.2f\nHeight = %.2f\nSurface Area = %.2f\nVolume =%.2f\n",  radius, height, surfaceArea(), volume());
    }


}