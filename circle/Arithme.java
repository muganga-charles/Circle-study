package circle;

import java.util.Scanner;

public class Arithme {
    public static void main(String[] args) {
        double area,circumfrence,diameter,radius;
        Propery Properties;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        

        Properties = new Propery(radius);

        area = Properties.getArea();
        circumfrence = Properties.getCircumfrence();
        diameter = Properties.getDiameter();

        System.out.println("the area is : " + area + "\nThe circumfrence is : " + circumfrence + "\nThe diameter is : " + diameter);
        

    }
}
