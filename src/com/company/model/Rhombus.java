package com.company.model;

import com.company.enums.Color;
import com.company.enums.RhombusParam;

public class Rhombus extends Figure {

    private RhombusParam param;

    public Rhombus() {
        this.param = RhombusParam.DEFAULT;
    }

    public Rhombus(int x, int y, int side, Color color) {
        super(x, y, side, color);
        this.param = RhombusParam.DEFAULT;
    }

    public Rhombus(int x, int y, int side, Color color, RhombusParam param) {
        super(x, y, side, color);
        this.param = param;
    }

    @Override
    public void drew() {
        if (param == RhombusParam.DEFAULT) {
            drewDefault();
        } else if (param == RhombusParam.LEFT_RHOMBUS) {
            drewLeft();
        } else if (param == RhombusParam.RIGHT_RHOMBUS) {
            drewRight();
        }
    }

    private void drewDefault() {

        for (int j = 0; j < y; j++) {
            System.out.println();
        }

        //copy , dont understand :(
        int space = side - 1;
        for (int j = 1; j <= side; j++) {
            for (int i = 1; i <= space + x + 1; i++) {
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.printf("%s*", color.getColor());
            }
            System.out.println("");
        }
        space = 1;
        for (int j = 1; j <= side - 1; j++) {
            for (int i = 1; i <= space + x + 1; i++) {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i <= 2 * (side - j) - 1; i++) {
                System.out.printf("%s*", color.getColor());
            }
            System.out.println("");
        }

    }

    private void drewLeft() {

        for (int j = 0; j < y; j++) {
            System.out.println();
        }

        for (int i = side; i >= 1; i--) {

            for (int j = 1; j <= side - i + x; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= side; j++) {
                System.out.printf("%s *", color.getColor());
            }
            System.out.println("");

        }

    }

    private void drewRight() {

        for (int j = 0; j < y; j++) {
            System.out.println();
        }

        for (int i = 0; i < side; i++) {

            for (int j = 1; j < side - i + x; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= side; j++) {
                System.out.printf("%s *", color.getColor());
            }
            System.out.println("");

        }

    }

    public RhombusParam getParam() {
        return param;
    }

    public void setParam(RhombusParam param) {
        this.param = param;
    }
}
