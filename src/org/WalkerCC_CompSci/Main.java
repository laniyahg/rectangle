package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {
	// write your code here
        org.WalkerCC_CompSci.Rectangle rectangle1 = new org.WalkerCC_CompSci.Rectangle(2,4);
        org.WalkerCC_CompSci.Square square1 = new org.WalkerCC_CompSci.Rectangle(2,4);

        System.out.println("The length of rectangle 1 is: " + rectangle1.getlength());
        System.out.println("The width of rectangle1 is: " + rectangle1.getwidth());

        System.out.println("The side length of square1:  " + square1.getsidelength());
    }
}
