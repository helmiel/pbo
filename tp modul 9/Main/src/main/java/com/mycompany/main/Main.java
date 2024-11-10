/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;
import java.util.ArrayList;
/**
 *
 * @author pc
 */

public class Main {
    
    public static void displayShapeInfo(Shape shape){
        System.out.println("Luas: " + shape.getArea());
        if(shape instanceof HasVolume){
            HasVolume volumeShape = (HasVolume) shape;
            System.out.println("Volume:"+volumeShape.getVolume());
        }
        System.out.println("--------------------------");
    }
    
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(2.25, 4.0));
        shapes.add(new Rectangle(4.0, 4.0));
        shapes.add(new Circle(10.0));
        shapes.add(new Cube(5.0));
        shapes.add(new Tube(10.0, 5.0));
        for (Shape shape : shapes) {
            displayShapeInfo(shape); 
        }
    }
}
