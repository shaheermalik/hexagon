import java.util.Scanner;

import java.text.DecimalFormat;
public class hexagon

{
    public static void main (String args[])

    {
        Scanner input = new Scanner(System.in);

        DecimalFormat rounder = new DecimalFormat(".##");


        double length, area;


        System.out.println("Enter the length of the side: ");

        length = input.nextDouble();



        area = (6 * Math.pow(length, 2)) / (4 * Math.tan((Math.PI/6)));


        System.out.println("The area of a hexagon is " + rounder.format(area));

        
    }

}