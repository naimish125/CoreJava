/**
 *
 * 6. Write a function to print your name and call the function from main method.
 */
package org.ns.java;

public class CallingFunction {

    static void myMethod() {
        System.out.println("My Name is 'Naimish'");
    }

    public static void main(String[] args) {
        /* To call a method, you just need to type the method name
           followed by open and closed parentheses */
        myMethod();
    }
}