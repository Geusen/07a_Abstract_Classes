package com.cc.java;

public class Triangle extends Shape {

    private double baseline;
    private double height;

    

    public Triangle(double baseline, double height) {
        this.baseline = baseline;
        this.height = height;
    }



    @Override
    public double area() {
        return this.baseline * this.height / 2;
    }
    
    
}
