package com.nadir.paint.tools;

import com.nadir.paint.windows.DrawingCanvas;
import javafx.event.EventHandler;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Brush extends Tool {
    @Override
    public void setEvents(DrawingCanvas canvas) {
        canvas.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.setFill(canvas.getWorkingColor());
                gc.fillOval(mouseEvent.getX(), mouseEvent.getY(), 10, 10);
            }
        });
    }

    @Override
    public void unsetEvents(DrawingCanvas canvas) {
        canvas.setOnMouseDragged(null);
    }
}
