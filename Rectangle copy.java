// Name:       Dymon West
// Class:      CS 3305/Section#02
// Term:       Spring 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name:   IntelliJ

public class Rectangle {

    private double width;
    private double height;

    /*This method is a default constructor
    and passes default variables to create
    a 1 by 1 rectangle.*/
    public Rectangle() {

        this.width = 1.00; //sets the default width of rectangle to 1.
        this.height = 1.00; // sets the default width for the rectangle's height to 1.
    }

    /*This method is a constructor
    that takes user input and creates
    a rectangle based off of the users input.*/
    public Rectangle(double width, double height) {

        this.width = width; // Sets the default width attributes to equal the constructor parameters, so the width can update based off user input.
        this.height = height; // Sets the default height attribute to be updated based off the parameters which are entered from user input.
    }

    /*Getter method that returns
     the updated width of the rectangle.*/
    public double getWidth() {
        return width; //Returns the width of the specified rectangle object.
    }

    /*Getter method that gets the
    updated height of the rectangle.*/
    public double getHeight() {
        return height; //returns the height of the specified rectangle object.
    }

    /*Getter method that returns
     the area of the rectangle.*/
    public double getArea() {
        return (width * height); //returns the updated area for respective rectangle object.
    }

    /*Getter method for the
    perimeter of the rectangle.*/
    public double getPerimeter() {
        return 2 * (width + height); // returns the perimeter of the respective rectangle object.
    }

    /*String method that returns
    a prompt describing the width
    and height of the respective
    rectangle object.*/
    public String printRectangle(String objectName) {
        return objectName + " is " + width + " unit(s) wide and " + height + " unit(s) high."; //String output that tells the user a description of their rectangle attributes.
    }

}
