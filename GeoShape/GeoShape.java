
abstract public class GeoShape{

    private double dim1;
    private double dim2;

    public GeoShape(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double getDim1(){
        return dim1;
    }

    public double getDim2(){
        return dim2;
    }

    public void setDim1(double dim1){
        this.dim1 = dim1;
    }

    public void setDim2(double dim2){
        this.dim2 = dim2;
    }

    abstract public double area();

    static public double sumArea(GeoShape shape1, GeoShape shape2, GeoShape shape3){
        return shape1.area() + shape2.area() + shape3.area();
    }

}

class Rectangle extends GeoShape{

    public Rectangle(double _dim1, double _dim2){
        super(_dim1, _dim2);
    }

    public double area(){
        return getDim1() * getDim2();
    }

}

class Triangle extends GeoShape{

    public Triangle(double _dim1, double _dim2){
        super(_dim1, _dim2);
    }

    public double area(){
        return 0.5 * getDim1() * getDim2();
    }

}

class Circle extends GeoShape{

    public Circle(double _dim1){
        super(_dim1, 0);
    }

    public double area(){
        return 3.14 * getDim1() * getDim1();
    }

}

class Main{
    public static void main(String[] args){
        GeoShape rect = new GeoShape(10, 20);
        System.out.println("Area of Rectangle: " + rect.area());

        GeoShape tri = new Triangle(10, 20);
        System.out.println("Area of Triangle: " + tri.area());

        GeoShape circ = new Circle(10);
        System.out.println("Area of Circle: " + circ.area());

        System.out.println("Sum of all areas: " + GeoShape.sumArea(rect, tri, circ));
    }
}