import { newRenderer } from "./renderer.js"
import { newCircle } from "./shapes/circle.js";
import { Rectangle, newRectangle } from "./shapes/rectangle.js";
import { newSquare } from "./shapes/square.js";

const rectangle: Shape = newRectangle(2, 3)
const mycircle: Shape = newCircle(4)
const mysuqare: Shape = newSquare(5)
const renderer = newRenderer(rectangle)
const circleRenderer = newRenderer(mycircle)
const squareRenderer = newRenderer(mysuqare)
renderer.draw()
circleRenderer.draw()
squareRenderer.draw()