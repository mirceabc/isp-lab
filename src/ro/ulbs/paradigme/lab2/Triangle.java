package ro.ulbs.paradigme.lab2;

public class Triangle extends Form {

    private float height;
    private float base;

    public Triangle(){
        super();
        this.height = 1;
        this.base = 1;
    }

    public Triangle(float height, float base, String color){
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public float getArea() {
        return (base * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle with base " + base + ", height " + height + ". " + super.toString();
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Triangle other)) return false;
        return Float.compare(base, other.base) == 0 &&
                Float.compare(height, other.height) == 0 &&
                this.toString().equals(other.toString());
    }
}
