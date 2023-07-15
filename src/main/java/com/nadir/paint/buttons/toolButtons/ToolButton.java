package com.nadir.paint.buttons.toolButtons;

import com.nadir.paint.tools.Tool;
import com.nadir.paint.windows.DrawingCanvas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public abstract class ToolButton extends Button {
    private Tool tool;

    public ToolButton(Tool passedTool, DrawingCanvas canvas, String label) {
        super(label);
        tool = passedTool;
        this.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                canvas.selectTool(passedTool);
            }
        });
    }

    public Tool getTool() {
        return tool;
    }
}
