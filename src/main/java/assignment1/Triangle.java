package assignment1;

public class Triangle extends Shape implements TwoDimenstionalProperties{
    private double height;
    private double width;

    public Triangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }



    public Triangle setHeight(double height) {
        this.height = height;
        return this;
    }



    public double getWidth() {
        return width;
    }



    public Triangle setWidth(double width) {
        this.width = width;
        return this;
    }







}
