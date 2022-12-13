/*
 * class for circle and rectangle to calculate and print area and perimeter
 * mohamed ahmed elsayed elfikey
 * id 1900306
 */
package task6_class_for_circle_and_rectangle;


public class Task6_class_for_circle_and_rectangle {

   
    public static void main(String[] args) {
        int n1=0;
        Calculate_Area s1=new Calculate_Area();
        System.out.println("the area of circle = "+s1.circle(5));
        Calculate_Area s2=new Calculate_Area();
        System.out.println("the area of rectangle = "+s2.rectangle(5, 10));
        Calculate_Perimeter s3=new Calculate_Perimeter();
        System.out.println("the perimeter of circle = "+s3.circle(5));
        Calculate_Perimeter s4=new Calculate_Perimeter();
        System.out.println("the perimeter of rectangle = "+s4.rectangle(5, 10));
        
        
    }
    
}
