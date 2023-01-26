/******
 *     - License information: GNU General Public License v3.0
 *     - What the piece of code does: This code is a simple project that
 *     can be used to compare the prices of two or more pizzas by either
 *     sq/in or sq/cm.
 *     - Author: Chris Oswald
 *     - Related code:
 *          UserInterface.java
 *          Food.java (interface)
 *          Pizza.java (implements Food.java)
 *     - Sample wire representations of data structures.
 *     - TODOs:
 ******/

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Pizza Evaluation Tool!\n");

        UserInterface ui = new UserInterface();
        ui.menu();

    }
}