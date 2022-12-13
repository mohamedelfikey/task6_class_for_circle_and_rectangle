/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6_class_for_circle_and_rectangle;

/**
 *
 * @author SOFT
 */
public class Calculate_Area { // I do Calculate_Area class to calculate area of all shapes 
    public double circle (double raduis)
    {
        double area= 3.14*raduis*raduis;
        return area;
    }
    public double rectangle (double length,double width)
    {
        double area= length*width;
        return area;
    }
    
}
