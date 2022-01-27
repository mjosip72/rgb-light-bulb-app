package main;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ColorWheel extends Canvas {

    private GraphicsContext g;
    private double width, height, radius, offset;
    private WritableImage image;

    private double mx, my;

    public ColorWheel(int radius, int offset) {

        this.radius = radius;
        this.width = 2 * (radius + offset);
        this.height = 2 * (radius + offset);
        this.offset = offset;

        this.mx = this.width / 2f;
        this.my = this.height / 2f;

        this.g = getGraphicsContext2D();

        setWidth(this.width);
        setHeight(this.height);

        image = new WritableImage(2 * radius, 2 * radius);
        renderColorWheel();

    }

    private void renderColorWheel() {
        PixelWriter writer = image.getPixelWriter();
        for(int y = 0; y < image.getHeight(); y++) {
            for(int x = 0; x < image.getWidth(); x++) {
                pickColor(x, y);
            }
        }
    }

    private void pickColor(double x, double y) {

        double dis = Math.sqrt( Math.pow(mx-x, 2) + Math.pow(my-y, 2) );



    }

    private void render() {
        g.clearRect(0, 0, width, height);
        g.setFill(Color.GREEN);
        g.drawImage(image, offset, offset);
    }

}
