
package task6_class_for_circle_and_rectangle;


public class Calculate_Perimeter { // I do Calculate_Perimeter class to calculate perimeter of all shapes
    public double circle (double raduis)
    {
        double perimeter= 2*3.14*raduis;
        return perimeter; 
    }
    public double rectangle (double length,double width)
    {
        double perimeter= 2*(length*width);
        return perimeter;
    }
}
