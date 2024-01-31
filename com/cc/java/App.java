package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     
    Circle circle = new Circle(5);
    Rectangle rectangle = new Rectangle(10, 10);
    Triangle triangle = new Triangle(10, 10);
       
        output("------ Fläche ------");
        output("Fläche Kreis ------" +Double.toString(circle.area()));
        output("Fläche Rechteck" + Double.toString(rectangle.area()));
        output("Fläche Dreieck -----" + Double.toString(triangle.area()));

        // Das geht nicht mehr ... Abstraktion
        // Shape shape = new Shape();

        output("------ Differenzen ----");
        output("Diff. r-t :" + areaDiff(rectangle, triangle));
        output("Diff r-c :" + areaDiff(rectangle, circle));
        output("Diff. c-r: " + areaDiff(circle, rectangle));
        output("Diff. c-t: " + areaDiff(circle, triangle));
        output("Diff. t-t: " + areaDiff(triangle, triangle));
    }

  
        // 1. Iteration  ggf. 1000x überladen ...
        // private static double areaDiff(Rectangle r, Triangle t) {
        //     return r.area() - t.area();
        // }


        // 2. Iteratiopn: Polymorphie - besser!
        private static double areaDiff(Shape s1, Shape s2) {
            return s1.area() - s2.area();
        }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

