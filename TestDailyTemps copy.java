// Name:       Dymon West
// Class:      CS 3305/Section#02
// Term:       Spring 2025
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name:   IntelliJ

import java.util.Scanner;

public class TestDailyTemps {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // variables and arrays for user's inputs.
        int userTemp;
        String userDay = " ";
        int[] usersWeekOfTemps = new int[7];
        DailyTemps usersSavedTemps = new DailyTemps(usersWeekOfTemps);


        /*
        For loop that loops through prompt
        asking for user's temp according to
        the day then initializes the array with
        user's temp according to appropriate index.
         */
        for(int i=0; i < 7; i++) {

            System.out.print("It's " + usersSavedTemps.theWeekday[i] + " of the week, enter the Temperature:  ");
            userTemp = scanner.nextInt();
            usersSavedTemps.setTemp(usersSavedTemps.theWeekday[i], userTemp); //calls setTemp method  and passes object's array attribute and user's temps.

            usersWeekOfTemps[i] = userTemp;


        }



        /*
        Prompts for the user to
        change temp and see the
        lowest and highest temps
        along with printed temps.
         */

        System.out.println();

        System.out.println("Testing method setTemp(): ");
        System.out.print("What day of the week would you like to change the temperature of? ");
        userDay = scanner.next();

        System.out.print("What is the new temperature? ");
        userTemp = scanner.nextInt();

        usersSavedTemps.setTemp(userDay, userTemp);

        System.out.println();

        System.out.println("Testing method Freezing(): ");
        System.out.println("Number of freezing days is " + usersSavedTemps.Freezing() + " day(s). ");

        System.out.println();

        System.out.println("Testing method Warmest(): ");
        System.out.println("The warmest day of the week is " + usersSavedTemps.Warmest() + ".");

        System.out.println();

        System.out.println("Testing method printTemps(): ");
        System.out.println("Your weeks temperatures: ");
        System.out.println();
        usersSavedTemps.printTemps();








    }
}
