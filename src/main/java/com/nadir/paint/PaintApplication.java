package com.nadir.paint;

import com.nadir.paint.buttons.colorButtons.ColorButtonBar;
import com.nadir.paint.buttons.toolButtons.BrushButton;
import com.nadir.paint.buttons.toolButtons.ClearButton;
import com.nadir.paint.buttons.toolButtons.ToolButton;
import com.nadir.paint.tools.Brush;
import com.nadir.paint.windows.ColorPanel;
import com.nadir.paint.windows.DrawingCanvas;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class PaintApplication extends Application {
    private boolean isDrawing = false;

    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("Paint");

        ColorPanel colorPanel = new ColorPanel();
        DrawingCanvas canvas = new DrawingCanvas(500, 500, colorPanel);
        canvas.selectTool(new Brush());

        ToolButton brushButton = new BrushButton(canvas,"brush");
        ToolButton clearButton = new ClearButton(canvas,"clear");

        VBox toolBar = new VBox();
        toolBar.getChildren().addAll(brushButton, clearButton);

        ColorButtonBar colorButtonBar = new ColorButtonBar(canvas, Color.BLACK, Color.WHITE, Color.RED, Color.PINK, Color.BLUE, Color.GREEN);

        HBox root = new HBox();
        root.setStyle("-fx-background-color: grey;");
        root.getChildren().addAll(toolBar, canvas, colorButtonBar, colorPanel);
        Scene scene = new Scene(root, 900, 1000);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}