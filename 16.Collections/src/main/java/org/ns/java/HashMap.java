/**
 *
 * 2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
 * - a. Insert a Key value mapping into the map
 * - b. Fetch the value of a Key
 * - c. Create a clone/copy of HashMap
 * - d. Check if the given Key is in the Map
 * - e. Check if the value is in the Map
 * - f. Check if the map is empty
 * - g. Print the size of the Map to the console
 * - h. Print all the Keys of the map to the console
 * - j. Remove a specific Key-value pair
 * - k. Copy all the elements of the Map to another Map
 */
/* Java HashMap class implements the Map interface which allows us
to store key and value pair, where keys should be unique. */

package org.ns.java;

public class HashMap {
    public static void main(String[] args) {
        //storing key in Integer and value in String
        java.util.HashMap<Integer, String> java = new java.util.HashMap<>();

        /* If you try to insert the duplicate key, it will
            replace the element of the corresponding key.  */
        //a. Inserting Student ID as Key & Name as value using put() method
        java.put(1, "Sharan");
        java.put(2, "Rohit");
        java.put(3, "Leo");
        java.put(4, "Keerthana");
        java.put(5, "Aditya");
        java.put(6, "Manoj");
        java.put(7, "Mahideep");
        java.put(8, "Prapul");
        java.put(9, "Dheeraj");
        java.put(10, "Rahul");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("java = " + java);

        //b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(java.get(6));

        //c. Creating a clone/copy of HashMap using clone() method
        System.out.println("\nclone/copy of HashMap java : ");
        System.out.println(java.clone());

        //d. Checking if the given Key is in the Map using containsKey() method
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(java.containsKey(3));

        //e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Sharan' is in the map :");
        System.out.println(java.containsValue("Sharan"));

        //f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(java.isEmpty());

        //g. Printing the size of the Map to the console using size() method
        System.out.println("\nThe size of the Map is :");
        System.out.println(java.size());

        //h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(java.keySet());

        //j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        java.remove(2, "Rohit");
        System.out.println(java);

        //k. Copying all the elements of the Map to another Map using puttAll() method
        System.out.println("\nCopied all the elements of the java to icfai :");

        java.util.HashMap<Integer, String> icfai = new java.util.HashMap<>();

        icfai.putAll(java);
        System.out.println("icfai = " + icfai);
    }
}