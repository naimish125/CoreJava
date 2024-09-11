
/**
 *
 * 07. Create an interface and inherit it from the other interface.
 */
//interface
package org.ns.java;

interface java_7 {
    void methodOne();
}

//inherited interface
interface java_07 extends java_7 {
    void methodTwo();
}

class InheritedInterface implements java_07 {
    //override method of interface java_7
    @Override
    public void methodOne() {
        System.out.println("This is first method");
    }
    //override method of inherited interface java_07
    @Override
    public void methodTwo() {
        System.out.println("This is second method");
    }

    public static void main(String[] args) {
        //creating obj of InheritedInterface
        InheritedInterface if7 = new InheritedInterface();
        //Calling the methods implemented
        if7.methodOne();
        if7.methodTwo();
    }
}