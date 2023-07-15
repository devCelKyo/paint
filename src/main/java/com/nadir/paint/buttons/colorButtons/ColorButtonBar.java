package com.nadir.paint.buttons.colorButtons;

import com.nadir.paint.windows.DrawingCanvas;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class ColorButtonBar extends VBox {
    private List<ColorButton> buttons;
    private DrawingCanvas canvas;

    public ColorButtonBar(DrawingCanvas canvas, Color... colors) {
        buttons = new ArrayList<>();
        canvas = canvas;
        for (Color color : colors) {
            ColorButton button = new ColorButton(color, canvas);
            buttons.add(button);
            this.getChildren().add(button);
        }
    }
}
