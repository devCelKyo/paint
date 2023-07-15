package com.nadir.paint.windows;

import com.nadir.paint.tools.Tool;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class DrawingCanvas extends Canvas {
    private Tool currentTool;
    private ColorPanel colorPanel;

    public DrawingCanvas(int height, int width, ColorPanel colorPanel) {
        this.setHeight(height);
        this.setWidth(width);
        this.clear();
        this.colorPanel = colorPanel;
        this.colorPanel.setColor(Color.BLACK);
    }

    public void selectTool(Tool tool) {
        unselectTool();
        currentTool = tool;
        tool.setEvents(this);
    }

    public void unselectTool() {
        if (currentTool != null) currentTool.unsetEvents(this);
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void clear() {
        GraphicsContext gc = this.getGraphicsContext2D();
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, this.getWidth(), this.getHeight());
    }

    public void setWorkingColor(Color color) {
        this.colorPanel.setColor(color);
    }

    public Color getWorkingColor() {
        return this.colorPanel.getColor();
    }
}
