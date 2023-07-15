package com.nadir.paint.tools;

import com.nadir.paint.windows.DrawingCanvas;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Clear extends Tool{
    @Override
    public void setEvents(DrawingCanvas canvas) {
        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                canvas.clear();
            }
        });
    }

    @Override
    public void unsetEvents(DrawingCanvas canvas) {
        canvas.setOnMouseClicked(null);
    }
}
