package assignment1;

import java.util.Scanner;

public class ShapeGenerator {

    public static Shape generateShape(int option){
        Scanner scan = new Scanner(System.in);
        switch(option) {
            case 1:
                return generateTriangle(scan);
            case 2:
                return generateSquare(scan);
            case 3:
                return generateRectangle(scan);
            case 4:
                return generateCube(scan);
            case 5:
                return generatePrism(scan);
            default:
            throw new IllegalArgumentException("Invalid input.");
        }
    }



    private static Shape generatePrism(Scanner scan) {
        while(true){
            try{
                System.out.println("Enter the length of the prism: ");
                String length = scan.next();
                double lengthDbl =  Double.parseDouble(length);
                System.out.println("Enter the height of the prism: ");
                String height = scan.next();
                double heightDbl =  Double.parseDouble(height);
                System.out.println("Enter the width of the prism: ");
                String width = scan.next();
                double widthDbl =  Double.parseDouble(width);
                return new Prism(lengthDbl, widthDbl, heightDbl);
            }catch(Exception e){
                System.out.println("Not valid input try again...");
                continue;
            }
        }
    }



    private static Shape generateCube(Scanner scan) {
        while(true){
            try{
                System.out.println("Enter the side of the cube: ");
                String side = scan.next();
                double sideDbl =  Double.parseDouble(side);
                return new Cube(sideDbl);
            }catch(Exception e){
                System.out.println("Not valid input try again...");
                continue;
            }
        }
    }



    private static Shape generateRectangle(Scanner scan) {
        while(true){
            try{
                System.out.println("Enter the length of the rectangle: ");
                String length = scan.next();
                double lengthDbl =  Double.parseDouble(length);

                System.out.println("Enter the height of the rectangle: ");
                String height = scan.next();
                double heightDbl =  Double.parseDouble(height);
                return new Rectangle(lengthDbl, heightDbl);
            }catch(Exception e){
                System.out.println("Not valid input try again...");
                continue;
            }
        }
    }



    private static Shape generateSquare(Scanner scan) {
        while(true){
            try{
                System.out.println("Enter the side of the square: ");
                String side = scan.next();
                double sideDbl =  Double.parseDouble(side);

                return new Square(sideDbl);
            }catch(Exception e){
                System.out.println("Not valid input try again...");
                continue;
            }
        }
    }



    private static Shape generateTriangle(Scanner scan) {
        while(true){
            try{
                System.out.println("Enter the height of the triangle: ");
                String height = scan.next();
                double heightDbl =  Double.parseDouble(height);
                System.out.println("Enter the width of the triangle: ");

                String width = scan.next();
                double widthDbl =  Double.parseDouble(width);
                return new Triangle(widthDbl, heightDbl);
            }catch(Exception e){
                System.out.println("Not valid input try again...");
                continue;
            }
        }
    }
}
