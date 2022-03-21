package com.concept.factorydesignpattern;

//Decorator design pattern is 'Structural' type of design pattern.
//The Decorator design pattern allows us to dynamically add functionality and behaviour to an object without
//affecting the behaviour of other existing objects in the same class.

//We use inheritance to extend the behaviour of the class.This takes place at compile time and all the instances  of that class get the extended behaviour.

//Decorator design pattern allows us to add the functionality to an object (not class) at runtime, and we can apply this customized functionality
//to an individual object based on our requirement or choice.



//Simple Main program to execute and test the decorator code
public class DecoratorPatternClient {
    public static void main(String[] args) {

        System.out.println("Creating simple shape object");
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        System.out.println("Drawing simple shape object");
        rectangle.draw();
        System.out.println();
        circle.draw();

        System.out.println("Creating Decorated circle with Red color,Blue lines in dash pattern and thickness of 2..");
        Circle c = new Circle();
        LineThicknessDecorator lt = new LineThicknessDecorator(c,2d);
        LineStyleDecorator ls = new LineStyleDecorator(lt,LineStyle.DASH);
        LineColorDecorator lc = new LineColorDecorator(ls,Color.BLUE);
        FillColorDecorator fc = new FillColorDecorator(lc,Color.RED);

        Shape circle3 = fc;
         circle3.draw();
        System.out.println();






    }
}

interface Shape{

   void draw();
   void reSize();
   String description();
   boolean isHide();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public void reSize() {
        System.out.println("Resizing Circle");
    }

    @Override
    public String description() {
        return "Circle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public void reSize() {
        System.out.println("Resizing Rectangle");
    }

    @Override
    public String description() {
        return "Rectangle object";
    }

    @Override
    public boolean isHide() {
        return false;
    }
}


//So far we are good we can create Circle or Rectangle shape,but we would like to have some additional functionality for Shape,
//like Fill-color,Line-color,Line-thickness,Line -style and so on.
abstract class ShapeDecorator implements Shape {

    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        //super();
        this.decoratedShape = decoratedShape;
    }
}

enum Color {
    RED,
    GREEN,
    YELLOW,
    BLUE,
    WHILE,
    BLACK
}

enum LineStyle {
    SOLID,
    DASH,
    DOT,
    DOUBLE_DASH
}

//Create FillColorDecorator to add the functionality of fill-color to the Shape

class FillColorDecorator extends ShapeDecorator {
    protected Color color;

    public FillColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Fill color :" + color);
    }

    @Override
    public void reSize() {
        decoratedShape.reSize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " filled with " + color + " color.";
    }

    //no change in the functionality
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}

//Create the LineColorDecorator to add the functionality of line-color in the Shape

class LineColorDecorator extends ShapeDecorator {
    protected Color color;


    public LineColorDecorator(Shape shapeDecorator, Color color) {
        super(shapeDecorator);
        this.color=color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line Color :" + color);
    }
    //No change in the functionality
    @Override
    public void reSize() {
    decoratedShape.reSize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + color + " color.";
    }
    //No change in the functionality
    //No change in the functionality
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}

//create LineThicknessDecorator to add the functionality of custom line thickness in the Shape

class LineThicknessDecorator extends ShapeDecorator {

    protected double thickness;

    public LineThicknessDecorator(Shape shapeDecorator, double thickness) {
        super(shapeDecorator);
        this.thickness = thickness;
    }


    @Override
    public void draw() {
      decoratedShape.draw();
        System.out.println("Line Thickness :"+thickness);
    }
    //No change in the functionality
    @Override
    public void reSize() {
      decoratedShape.reSize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with line thickness :" + thickness;
    }
    //No change in the functionality
    @Override
    public boolean isHide() {
        return false;
    }
}

//create LineStyleDecorator to add functionality of custom line styles in the Shape

class LineStyleDecorator extends ShapeDecorator {

    protected LineStyle lineStyle;

    public LineStyleDecorator(Shape shapeDecorator, LineStyle lineStyle) {
        super(shapeDecorator);
        this.lineStyle = lineStyle;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line Style: " + lineStyle);

    }

    //No change in the functionality
    @Override
    public void reSize() {
        decoratedShape.reSize();
    }

    @Override
    public String description() {
        return decoratedShape.description() + " drawn with " + lineStyle + " lines.";
    }

    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}