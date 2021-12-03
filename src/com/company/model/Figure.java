package com.company.model;

import com.company.enums.Color;
import com.company.exception.IncorrectValueException;

public abstract class Figure {

    private static final int POSITION_X = 0;
    private static final int POSITION_Y = 0;
    private static final int SIDE = 2;

    protected int x;
    protected int y;
    protected int side;
    protected Color color;

    protected abstract void drew();

    public Figure() {
        this(POSITION_X, POSITION_Y, SIDE, Color.WHITE);
    }

    public Figure(int x, int y, int side, Color color) {
        chackPosition(x, y);
        chackSide(side);
        this.x = x;
        this.y = y;
        this.side = side;
        this.color = color;
    }

    private void chackPosition(int positionX, int positionY) {
        if (positionX < 0 || positionY < 0) {
            throw new IncorrectValueException("incorrect value. Coordinates cannot be negative. \n"
                    + "x: " + positionX + "\n" + "y: " + positionY);
        }
    }

    private void chackSide(int side) {
        if (side < 1) {
            throw new IncorrectValueException("incorrect value. side cannot be <1. \n"
                    + "Side: " + side);
        }
    }

}
