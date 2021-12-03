package com.company;

import com.company.enums.Color;
import com.company.enums.RhombusParam;
import com.company.enums.TriangleParam;
import com.company.model.Rhombus;
import com.company.model.Square;
import com.company.model.Triangle;

public class Main {

    public static void main(String[] args) {

        Square square = new Square(4, 2, 5, Color.RED);
        Square square1 = new Square(4, 2, 5, Color.BLUE);
        Triangle triangle = new Triangle(4, 2, 5, Color.GREEN);
        Triangle triangle1 = new Triangle(4, 2, 5, Color.RED, TriangleParam.LEFT_TRIANGLE);
        Triangle triangle2 = new Triangle(4, 2, 5, Color.BLUE, TriangleParam.RIGHT_TRIANGLE);
        Triangle triangle3 = new Triangle();
        Rhombus rhombus = new Rhombus(4, 2, 5, Color.RED);
        Rhombus rhombus1 = new Rhombus(4, 2, 5, Color.GREEN, RhombusParam.RIGHT_RHOMBUS);
        Rhombus rhombus2 = new Rhombus(4 , 2 , 5 , Color.YELLOW , RhombusParam.LEFT_RHOMBUS);
        Rhombus rhombus3 = new Rhombus();


        square.drew();
        square1.drew();
        triangle.drew();
        triangle1.drew();
        triangle1.setParam(TriangleParam.DEFAULT);
        triangle1.drew();
        triangle2.drew();
        triangle2.setParam(TriangleParam.LEFT_TRIANGLE);
        triangle2.drew();
        triangle3.drew();
        System.out.println();
        rhombus.drew();
        rhombus1.drew();
        rhombus1.setParam(RhombusParam.DEFAULT);
        rhombus1.drew();
        rhombus2.drew();
        System.out.println();
        rhombus3.drew();

    }
}
