package assignment1;

public class Rectangle extends Shape implements TwoDimenstionalProperties{
    private double height;
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }



    public Rectangle setHeight(double height) {
        this.height = height;
        return this;
    }



    public double getWidth() {
        return width;
    }



    public Rectangle setWidth(double width) {
        this.width = width;
        return this;
    }

}
