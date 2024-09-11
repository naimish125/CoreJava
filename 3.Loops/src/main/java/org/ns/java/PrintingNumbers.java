/**
 *
 * 2. Write a java program to print 1 to 20 numbers using the while loop.
 */
package org.ns.java;

public class PrintingNumbers {
    public static void main(String[] args) {
        int i = 1;
        //In while loop we separately need to initialize and increment the variable
        //loop executes from 1 to 20
        while (i <= 20) {
            System.out.print(i + "");
            //Every time the loop body is executed, this expression increments
            i++;
        }
    }
}