/**
 *
 * 3.Create a HashSet with at least 10 elements of type String
 * - Write program covering all the operations of HashSet
 */

//Java HashSet class is used to create a collection that uses a hash table for storage.
package org.ns.java;

import java.util.Iterator;

public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> java = new java.util.HashSet<>();

        //a. adding elements to the HashSet using add() method
        java.add("zero");
        java.add("one");
        java.add("two");
        java.add("three");
        java.add("four");
        java.add("five");
        java.add("six");
        java.add("seven");
        java.add("eight");
        java.add("nine");
        java.add("ten");
        //does not allow duplicate elements, Set contains unique elements only.
        java.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("java = " + java);


        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> itr = java.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(java.clone());

        //c. Removing a specific element using remove() method
        java.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("java = " + java);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(java.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(java.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(java.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        java.clear();
        System.out.println("java = " + java);
    }
}

