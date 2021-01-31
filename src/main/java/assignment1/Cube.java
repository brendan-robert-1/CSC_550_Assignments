package assignment1;

public class Cube extends Shape implements ThreeDimensionalProperties {
    private double side;

    public Cube(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }



    public Cube setSide(double side) {
        this.side = side;
        return this;
    }
}
