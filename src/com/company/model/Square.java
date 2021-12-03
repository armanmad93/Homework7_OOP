package com.company.model;

import com.company.enums.Color;

public class Square extends Figure {

    public Square() {
    }

    public Square(int x, int y, int side, Color color) {
        super(x, y, side, color);
    }

    @Override
    public void drew() {

        for (int i = 0; i < side + y; i++) {
            for (int j = 0; j < side + x; j++) {
                if (j >= x && i >= y) {
                    System.out.printf("%s *", color.getColor());
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
