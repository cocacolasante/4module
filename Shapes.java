public class Shapes{
    public static void main(String[] args){
        Shape sphere = new Sphere(5.0);
        Shape cylinder = new Cylinder(3.0, 5.0);
        Shape cone = new Cone(3.0, 5.0);

        Shape[] arrayOfShapes = {sphere, cylinder, cone};

        for (Shape s : arrayOfShapes){
            System.out.println(s.toString());
        }
    }
}