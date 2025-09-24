// Name:       Dymon West
// Class:      CS 3305/Section#02
// Term:       Spring 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name:   IntelliJ

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {

        //Scanner object that reads user's input.
        Scanner scanner = new Scanner(System.in);

        //Rectangle object that calls default constructor method.
        Rectangle myRectangle = new Rectangle();

        //Prompt's user and prints default object's attributes.
        System.out.println("myRectangle: ");
        System.out.println("------------");
        System.out.printf("Width:      " + "%.2f%n",myRectangle.getWidth()); //object calling on the get width method in order to print the default width.
        System.out.printf("Height:     " + "%.2f%n",myRectangle.getHeight());// object calling on the get height method in order to print the default height.
        System.out.printf("Area:       " + "%.2f%n",myRectangle.getArea()); // object calling on get are method and printing the objects area.
        System.out.printf("Perimeter:  " + "%.2f%n",myRectangle.getPerimeter()); // object calling on the get perimeter method and printing object's perimeter.

        System.out.println();

        System.out.println("Rectangle " + myRectangle.printRectangle("myRectangle")); //calling on the String method from the rectangle class, passing the object name, and printing the prompt.

        System.out.println();

        System.out.println("yourRectangle: ");
        System.out.println("------------");

        //Prompts that ask for the user width and height and then scans the doubles entered.
        System.out.print("Width:      ");
        double Userwidth = scanner.nextDouble();

        System.out.print("Height:     ");
        double Userheight = scanner.nextDouble();

        //Rectangle object that takes user input for the width and height and creates a specified rectangle.
        Rectangle yourRectangle = new Rectangle(Userwidth, Userheight); //object calling on the overloaded constructor method and passing in the user's entered width and height.

        System.out.printf("Area:       " + "%.2f%n",yourRectangle.getArea()); //object calling on the get area method in order to print the object's updated area.
        System.out.printf("Perimeter:  " + "%.2f%n",yourRectangle.getPerimeter()); //object calling on the get perimeter method in order to print the object's updated perimeter.

        System.out.println();

        System.out.println("Rectangle " + yourRectangle.printRectangle("yourRectangle")); //calling on the String method from the rectangle class, passing the object name, and printing the prompt.

        System.out.println();

        /*
        Prints user's objects attributes and prompts
        that tell the user the methods are being tested.
         */
        System.out.printf("Calling getWidth() for object yourRectangle... " + "%nObject yourRectangle's width is: " + yourRectangle.getWidth() + " units wide.");

        System.out.println();

        System.out.printf("%nCalling method getHeight() for object yourRectangle... " + "%nObject yourRectangle's height is: " + yourRectangle.getHeight() + " units high.");

        System.out.println();

        System.out.printf("%nTesting method getArea() on object yourRectangle... " + "%nObject yourRectangle's Area is: " + yourRectangle.getArea() + " units.");

        System.out.println();

        System.out.printf("%nTesting method getPerimeter() on object yourRectangle... " + "%nObject yourRectangle's Perimeter is: " + yourRectangle.getPerimeter() + " units.");

        System.out.println();

        System.out.printf("%nTesting method printRectangle() on object yourRectangle... " + "%nObject " + yourRectangle.printRectangle("yourRectangle"));

    }
}
