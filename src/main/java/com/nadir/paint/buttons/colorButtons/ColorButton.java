package com.nadir.paint.buttons.colorButtons;

import com.nadir.paint.windows.DrawingCanvas;
import javafx.event.EventHandler;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class ColorButton extends Canvas {
    private Color color;

    public ColorButton(Color passedColor, DrawingCanvas canvas) {
        color = passedColor;
        this.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                canvas.setWorkingColor(passedColor);
            }
        });

        this.setHeight(20);
        this.setWidth(20);
        GraphicsContext gc = this.getGraphicsContext2D();
        gc.setFill(color);
        gc.fillRect(0, 0, this.getWidth(), this.getHeight());
    }
}
