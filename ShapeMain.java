package ShapesAndArea;

import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.Callable;

public class ShapeMain {
    public static void main(String[] args) {

        /*Circle circle1 = new Circle("Blue", 2.5);
        System.out.println(circle1);
        System.out.println("Shape area is " + circle1.calcArea());
        System.out.println();

        Rectangle rectangle1 = new Rectangle("Black", 4.5, 6.4);
        System.out.println(rectangle1);
        System.out.println("Shape area is " + rectangle1.calcArea());
        System.out.println();

        Triangle triangle1 = new Triangle("White", 2, 4, 5);
        System.out.println(triangle1);
        System.out.println("Shape area is " + triangle1.calcArea());
        System.out.println();*/

        Shape arr[] = {new Rectangle("Black", 1.5, 6.4),
                new Rectangle("Green", 2.5, 6.4),
                new Rectangle("Purple", 3.5, 6.4),
                new Rectangle("Yellow", 4.5, 6.4),
                new Rectangle("White", 5.5, 6.4),
                new Circle("Blue", 6.5),
                new Circle("Brown", 7.5),
                new Triangle("Red", 5, 5, 5),
                new Triangle("White", 5, 5, 5)
        };

        double sumRectArea = 0;
        double sumTriangleArea = 0;
        double sumCircleArea = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            double v = arr[i].calcArea();
            if (arr[i] instanceof Triangle) {
                sumTriangleArea = sumTriangleArea + v;
            }
            if (arr[i] instanceof Rectangle) {
                sumRectArea = sumRectArea + v;
            }
            if (arr[i] instanceof Circle) {
                sumCircleArea = sumCircleArea + v;
            }
            arr[i].draw();
            System.out.println(v);

        }
        System.out.println("sumRectArea = " + sumRectArea);
        System.out.println("sumTriangleArea = "+sumTriangleArea);
        System.out.println("sumCircleArea = "+sumCircleArea);
        System.out.println();

        Shape arr2[] = {
                new Rectangle("Yellow", 4.5, 6.4),
                new Rectangle("White", 5.5, 6.4),
                new Rectangle("Blue", 6.5, 6.4),
                new Rectangle("Black", 1.5, 6.4),
                new Rectangle("Green", 2.5, 6.4),
                new Rectangle("Purple", 3.5, 6.4),
        };
        /*Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i].draw();
        }*/
        System.out.println();
        Shape arr3[] = {
                new Rectangle("Yellow", 4.5, 6.4),
                new Rectangle("White", 5.5, 6.4),
                new Circle("Yellow", 6.5),
                new Triangle("Red", 5, 5, 5),
                new Circle("Yellow", 7.5),
                new Rectangle("White", 3.5, 6.4),
        };
        Arrays.sort(arr3, new ShapeColorComparator());
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
