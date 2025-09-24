// Name:       Dymon West
// Class:      CS 3305/Section#02
// Term:       Spring 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name:   IntelliJ

import java.lang.reflect.Array;

public class DailyTemps {

    public String[] theWeekday =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public int[] dailyTemps;

    /*
    Default constructor that sets the Array size to 7.
     */
    public DailyTemps() {

        this.dailyTemps = new int[7]; //empty Array size 7.
    }

    /*
    Overloaded constructor that
    passes user's temperature's
    and saves them.
     */

    public DailyTemps(int[] savedTemps) {
        this.dailyTemps = savedTemps; // sets class array to save passed parameters into array.
    }

    /*
    Sets a new temp for a
    specified day from the
    user.
     */

    public void setTemp(String weekDay, int newTemp) {

        int index = dayToIndex(weekDay); //uses called method to store index with according weekday.
        this.dailyTemps[index] = newTemp; //saves new temp into specific array index.

    }

    /*
    Method that finds the lowest values
    entered by the user and counts how many
    values are lower than 32F.
     */

    public int Freezing() {

        //Initialized counter that keeps track of indexes that hold values lower than 32.
        int counter = 0;
        for (int i = 0; i < 7; i++) {
            if (dailyTemps[i] < 32) {
                counter++;

            }
        }

        return counter;
    }

    /*
    Finds the index that has the highest temp
    in the array filled with the user's temps
    and uses indexToDay method to convert the
    found index to a String saved in that index.
     */

    public String Warmest() {

        //Variable that holds values of respective index.
        int WarmestTemp = this.dailyTemps[0];
        int WarmestDay = 0; //variable to hold largest value.

        //For loop that searches array and sets a current temp and compares that temp to the warmest temp until largest value is found.
        for (int i = 1; i < this.dailyTemps.length; i++) {

            int currentTemp = this.dailyTemps[i];
            if (currentTemp > WarmestTemp) {

                WarmestTemp = currentTemp;
                WarmestDay = i;
            }
        }

        return indexToDay(WarmestDay);
    }

    /*
    Prints out the respective weekday
    with the user's inputted temps by
    using two arrays with the saved inputs
    and weekdays.
     */
    public void printTemps() {


        //For loop that prints out array's saved Strings.
        for (int i = 0; i < this.dailyTemps.length; i++) {

            //array that holds Strings initialized with the index to day method to save respective days with their index.
            this.theWeekday[i] = indexToDay(i);
            System.out.print(this.theWeekday[i]); //prints weekday after every iteration.

            //if else statements that ensure the weekdays are all formatted appropriately.
            if(this.theWeekday[i].equalsIgnoreCase("Wednesday")){
                System.out.print("\t");
            }
            else if(this.theWeekday[i].equalsIgnoreCase("Thursday")){
                System.out.print("\t");
            }
            else if(this.theWeekday[i].equalsIgnoreCase("Saturday")){
                System.out.print("\t");
            }
            else System.out.print("\t\t");

            System.out.println(this.dailyTemps[i]); //prints the temperatures with the according weekday after each iteration.

        }

    }

    /*
    Passes a String, weekday, and
    returns an int that is used as
    an index.
     */

    public int dayToIndex(String weekday) {

        //if statements that check for String input and return the respective index.
        if (weekday.equalsIgnoreCase("Monday")) {
            return 0;
        }
        if (weekday.equalsIgnoreCase("Tuesday")) {
            return 1;
        }
        if (weekday.equalsIgnoreCase("Wednesday")) {
            return 2;
        }
        if (weekday.equalsIgnoreCase("Thursday")) {
            return 3;
        }
        if (weekday.equalsIgnoreCase("Friday")) {
            return 4;
        }
        if (weekday.equalsIgnoreCase("Saturday")) {
            return 5;
        }
        if (weekday.equalsIgnoreCase("Sunday")) {
            return 6;
        } else return 403;
    }

    /*
    Passes integer and
    returns and int to
    convert index to day.
     */

    public String indexToDay(int index) {

        //if statements that check for int and return specific weekday.
        if (index == 0) {
            return "Monday";
        }
        if (index == 1) {
            return "Tuesday";
        }
        if (index == 2) {
            return "Wednesday";
        }
        if (index == 3) {
            return "Thursday";
        }
        if (index == 4) {
            return "Friday";
        }
        if (index == 5) {
            return "Saturday";
        }
        if (index == 6) {
            return "Sunday";
        } else return "Invalid input!";

    }

}
