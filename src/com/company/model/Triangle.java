package com.company.model;

import com.company.enums.Color;
import com.company.enums.TriangleParam;

public class Triangle extends Figure {

    private TriangleParam param;

    public Triangle() {
        this.param = TriangleParam.DEFAULT;
    }

    public Triangle(int x, int y, int side, Color color) {
        super(x, y, side, color);
        this.param = TriangleParam.DEFAULT;
    }

    public Triangle(int x, int y, int side, Color color, TriangleParam param) {
        super(x, y, side, color);
        this.param = param;
    }

    @Override
    public void drew() {
        if (param == TriangleParam.DEFAULT) {
            drewDefault();
        } else if (param == TriangleParam.LEFT_TRIANGLE) {
            drewLeft();
        } else if (param == TriangleParam.RIGHT_TRIANGLE) {
            drewRight();
        }
    }

    private void drewDefault() {
        for (int j = 0; j < y; j++) {
            System.out.println();
        }
        for (int i = 0; i < side; i++) {
            for (int j = side - i + x; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%s *", color.getColor());
            }
            System.out.println();
        }
    }

    private void drewRight() {

        for (int j = 0; j < y; j++) {
            System.out.println();
        }

        for (int i = 0; i < side; i++) {
            for (int j = 2 * (side - i) + x - 3; j >= 0; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.printf("%s *", color.getColor());
            }
            System.out.println();
        }
    }

    private void drewLeft() {
        int count = x;
        boolean term = false;

        for (int i = 0; i < side + y; i++) {
            for (int j = 0; j < side + x; j++) {
                if (j >= x && i >= y && count >= j) {
                    System.out.printf("%s *", color.getColor());
                    term = true;
                } else {
                    System.out.print(" ");
                }
            }
            if (term) {
                count++;
            }
            System.out.println();
        }
    }

    public TriangleParam getParam() {
        return param;
    }

    public void setParam(TriangleParam param) {
        this.param = param;
    }
}
