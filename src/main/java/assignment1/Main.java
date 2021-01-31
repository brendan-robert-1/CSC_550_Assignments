package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Shape> list = new ArrayList<>();

    public static void main(String[] args){
        System.out.println("Welcome to the Object Menu System");
        System.out.println("Author: Brendan Robert");
        while(true){
            int input = getInput();
            processInput(input);
        }
    }

    private static int getInput() {
        System.out.println("Select an Option:");
        System.out.println("1. Create a Triangle");
        System.out.println("2. Create a Square");
        System.out.println("3. Create a Rectangle");
        System.out.println("4. Create a Cube");
        System.out.println("5. Create a Prism");
        System.out.println("6. Print the size of the list");
        System.out.println("7. Quit");
        int val;
        Scanner scan = new Scanner(System.in);
        while(true){
            try{
                String input = scan.next();
                val = Integer.parseInt(input);
                break;
            }catch(Exception e){
                System.out.println("Not a valid integer please enter 1-7 for your option.");
                continue;
            }
        }
        return val;
    }

    private static void processInput(int input){
        if(input >0 && input < 6){
            Shape shape = ShapeGenerator.generateShape(input);
            list.add(shape);
        }else if(input == 6){
            System.out.println("The size of the list is: " + list.size());
        }else{
            System.out.println("Exiting.");
            System.exit(0);
        }
    }
}
