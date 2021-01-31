package assignment1;

public class Prism extends Shape implements ThreeDimensionalProperties{
    private double width;
    private double height;
    private double length;

    public Prism(double length, double width, double height){
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }



    public Prism setWidth(double width) {
        this.width = width;
        return this;
    }



    public double getHeight() {
        return height;
    }



    public Prism setHeight(double height) {
        this.height = height;
        return this;
    }





    public double getLength() {
        return length;
    }



    public Prism setLength(double length) {
        this.length = length;
        return this;
    }




}
