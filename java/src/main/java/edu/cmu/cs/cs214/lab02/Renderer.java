package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    public Shape object;
    
    Renderer(Shape object) {
        this.object = object;
    }

    void draw() {
        double area = object.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
