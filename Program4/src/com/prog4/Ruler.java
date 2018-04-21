package com.prog4;

public class Ruler {

    public void drawRuler(int length, int depth) {
        drawLine(depth, 0);
        for (int i = 1; i <= length; i++) {
            drawInterval(depth - 1);
            drawLine(depth, i);
        }
    }

    /**
     * Rysuje lninie od punktu srodkowego
     */
    private void drawInterval(int center) {
        if (center >= 1) {
            drawInterval(center - 1);
            drawLine(center);
            drawInterval(center - 1);
        }
    }

    /**
     * Rysuje linie o podanej dlugosci z opcjonalna etykieta
     */
    private void drawLine(int tickLength, int label) {
        for (int i = 0; i < tickLength; i++)
            System.out.print("-");
        if (label >= 0)
            System.out.print(" " + label);
        System.out.print("\n");
    }

    /**
     * Rysuje linie o podanej dlugosci bez etykiety
     */
    private void drawLine(int tickLength) {
        drawLine(tickLength, -1);
    }
}
