package edu.cmu.cs.cs214.lab02;
import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(1);
        Shape square = new Square(2);

        Renderer rectangleRenderer = new Renderer(rectangle);
        Renderer circleRenderer = new Renderer(circle);
        Renderer squareRenderer = new Renderer(square);

        rectangleRenderer.draw();
        circleRenderer.draw();
        squareRenderer.draw();
    }
}
