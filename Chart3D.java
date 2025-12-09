package com.mycompany.main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

public class Chart3D extends JPanel {

    private int value1 = 0; // Week 1
    private int value2 = 0; // Week 2
    private int value3 = 0; // Week 3
    private int value4 = 0; // Week 4

    private int depth = 12;

    private Color colorSideFace = new Color(0, 82, 204);
    private Color colorTopFace = new Color(51, 153, 255);
    private Color colorFrontFace = new Color(0, 122, 255);

    public Chart3D() {
        setBackground(Color.white);
    }

    // =========================
    // VALUE GETTERS & SETTERS
    // =========================

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
        repaint();
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
        repaint();
    }

    public int getValue3() {
        return value3;
    }

    public void setValue3(int value3) {
        this.value3 = value3;
        repaint();
    }

    public int getValue4() {
        return value4;
    }

    public void setValue4(int value4) {
        this.value4 = value4;
        repaint();
    }

    // Dynamically computed bar values
    private int[] getBarValues() {
        return new int[]{
            value1 * 10,
            value2 * 10,
            value3 * 10,
            value4 * 10
        };
    }

    // Fake rotate for future features
    public void rotateChart() {
        repaint();
    }

    // =========================
    // DRAWING 3D BAR CHART
    // =========================
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int[] barValues = getBarValues();
        int numBars = barValues.length;

        int width = getWidth();
        int height = getHeight();

        int barWidth = 60;
        int barSpacing = 35;

        int baseX = (width - (numBars * (barWidth + barSpacing) - barSpacing)) / 2;
        int baseY = height - 100;

        // ==== DRAW Y AXIS ====
        g.setColor(Color.black);
        g.drawLine(baseX - 40, baseY, baseX - 40, 50); // Y axis

        // Y-axis scale
        int maxValue = 100; // You can change this
        int step = 25;      // Tick every 20 units
        int scaleHeight = baseY - 50;

        for (int v = 0; v <= maxValue; v += step) {
            int y = baseY - (v * scaleHeight / maxValue);

            // Tick mark
            g.drawLine(baseX - 45, y, baseX - 35, y);

            // Number label
            g.drawString(String.valueOf(v), baseX - 70, y + 5);

            // Optional: horizontal grid lines
            g.setColor(new Color(220, 220, 220));
            g.drawLine(baseX - 30, y, baseX + 400, y); // long line across bars
            g.setColor(Color.black);
        }

        
        for (int i = 0; i < numBars; i++) {

            int barHeight = barValues[i];
            int x = baseX + i * (barWidth + barSpacing);

            // ==== FRONT FACE ====
            g.setColor(colorFrontFace);
            g.fillRect(x, baseY - barHeight, barWidth, barHeight);

            // ==== TOP FACE ====
            g.setColor(colorTopFace);
            Polygon top = new Polygon();
            top.addPoint(x, baseY - barHeight);
            top.addPoint(x + barWidth, baseY - barHeight);
            top.addPoint(x + barWidth + depth, baseY - barHeight - depth);
            top.addPoint(x + depth, baseY - barHeight - depth);
            g.fillPolygon(top);

            // ==== SIDE FACE ====
            g.setColor(colorSideFace);
            Polygon side = new Polygon();
            side.addPoint(x + barWidth, baseY - barHeight);
            side.addPoint(x + barWidth, baseY);
            side.addPoint(x + barWidth + depth, baseY - depth);
            side.addPoint(x + barWidth + depth, baseY - barHeight - depth);
            g.fillPolygon(side);

            // Label under each bar
            g.setColor(Color.black);
            g.drawString("Week " + (i + 1), x + 2, baseY + 20);
        }
    }
}

