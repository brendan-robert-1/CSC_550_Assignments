package assignment1;

public class Square extends Shape implements TwoDimenstionalProperties {
    private double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide() {
        return side;
    }



    public Square setSide(double side) {
        this.side = side;
        return this;
    }
}
