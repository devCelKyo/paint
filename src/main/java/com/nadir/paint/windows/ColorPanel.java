package com.nadir.paint.windows;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ColorPanel extends Canvas {
    private Color color;

    public ColorPanel() {
        this.setWidth(200);
        this.setHeight(200);
    }

    public void setColor(Color color) {
        this.color = color;
        GraphicsContext gc = this.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public Color getColor() {
        return color;
    }
}
