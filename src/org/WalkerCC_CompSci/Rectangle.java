package org.WalkerCC_CompSci;

public class Rectangle {
    double length;
    double width;

   public Rectangle(double length, double width){
       this.length = length;
       this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.Width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double Area(){
       return this.length * this.width;
    }
}
