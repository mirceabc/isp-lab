package ro.ulbs.paradigme.lab2;

public class Circle extends Form {
    private float radius;

    public Circle(){
        super();
        this.radius = 1;
    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + ". " + super.toString();
    }
}
