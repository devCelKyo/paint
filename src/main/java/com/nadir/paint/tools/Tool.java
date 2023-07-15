package com.nadir.paint.tools;

import com.nadir.paint.windows.DrawingCanvas;

public abstract class Tool {
    public abstract void setEvents(DrawingCanvas canvas);
    public abstract void unsetEvents(DrawingCanvas canvas);
}
