package com.nadir.paint.buttons.toolButtons;

import com.nadir.paint.tools.Clear;
import com.nadir.paint.windows.DrawingCanvas;

public class ClearButton extends ToolButton{
    public ClearButton(DrawingCanvas canvas, String label) {
        super(new Clear(), canvas, label);
    }
}
