package com.nadir.paint.buttons.toolButtons;

import com.nadir.paint.tools.Brush;
import com.nadir.paint.windows.DrawingCanvas;

public class BrushButton extends ToolButton {
    public BrushButton(DrawingCanvas canvas, String label) {
        super(new Brush(), canvas, label);
    }
}
