
/**
 *
 *
 * 1.Create an ArrayList of type String with 10 string elements. Add 10 string elements to
 * ArrayList and perform the below operations
 * - a. Add an element to the ArrayList
 * - b. Iterate through the ArrayList by using Iterator object
 * - c. Add an element at a specific index
 * - d. Remove an element from the ArrayList, Remove at an index
 * - e. Update the element at a specific index
 * - f. Check the element is present at a particular index
 * - g. Get an element at a particular index
 * - h. Find out the size of the ArrayList
 * - i. Check the given element is present in the ArrayList
 * - j. Remove all elements of the ArrayList
 */
package org.ns.java;
import java.util.Arrays;
import java.util.Iterator;
/* Java ArrayList class uses a dynamic array for storing the elements.
   It is like an array, but there is no size limit. We can add or remove elements anytime. */
public class ArrayList {

    public static void main(String[] args) {

        //passing an Array converted to List using the asList() method
        java.util.ArrayList<String> java = new java.util.ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println("\njava = " + java);

        //a. adding elements to the ArrayList using add method using add() method
        java.add("six");
        java.add("seven");
        java.add("eight");
        java.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("java = " + java);


        //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr = java.iterator();
        System.out.println("\nIterating through the ArrayList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Adding an element at a specific index using add() method
        java.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1 :");
        System.out.println("java = " + java);

        //d. Removing an element at a specific index using remove() method
        java.remove(1);
        System.out.println("\nAfter removing an element at index 1 :");
        System.out.println("java = " + java);

        //e. Updating the element at a specific index using set() method
        java.set(1, "ONE");
        System.out.println("\nAfter updating the element at index 1 :");
        System.out.println("java = " + java);

        //f. Checking the element is present at a particular index using indexOf() method
        System.out.println("\nThe element is present at index :");
        System.out.println(java.indexOf("three"));

        //g. Getting an element at a particular index using get() method
        System.out.println("\nThe element at index 3 :");
        System.out.println(java.get(3));

        //h. Finding the size of the ArrayList using size() method
        System.out.println("\nSize of the ArrayList : ");
        System.out.println(java.size());

        //i. Checking the element is present in the ArrayList using contains() method
        System.out.println("\n'two' is present in the ArrayList : ");
        System.out.println(java.contains("two")); //returns boolean value

        //j. Removing all elements of the ArrayList using clear() method
        System.out.println("\nAfter removing all elements of the ArrayList :");
        java.clear();
        System.out.println("java = " + java);
    }
}