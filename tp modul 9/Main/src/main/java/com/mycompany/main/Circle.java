/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.lang.Math;

/**
 *
 * @author pc
 */
public class Circle extends Shape {
    protected double radius;
    protected final double pi = Math.PI;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return pi * radius * radius;
    }
}
