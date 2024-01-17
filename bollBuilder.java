 import java.awt.Color;


public class BollBuilder {
    private double y;
    private double x;
    private double r;
    private Color color;
    private double stepX;
    private double stepY;

public BollBuilder(double cy , double cx, double cr, Color col, double mox, double moy){

    y = cy;
    x = cx;
    r = cr;
    color = col;
    stepX = mox;
    stepY = moy;
}

public BollBuilder(double cy , double cx, double cr, double mox, double moy){

    y = cy;
    x = cx;
    r = cr;
    color = Color.BLACK;
    stepX = mox;
    stepY = moy;
}

public void draw() {
    StdDraw.setPenColor(color);
    StdDraw.filledCircle(x, y, r);
}


public void move(){
    y = y + stepY;
    x = x + stepX;

}

public void bounceX(){
    stepX = -stepX;
}
public void bounceY(){
    stepY = -0.8 * stepY;
}
public boolean collideX (double xBorder){
return Math.abs(x + stepX) + r > Math.abs(xBorder);
}
public boolean collideY(double yBorder){
    return Math.abs(y + stepY) + r > Math.abs(yBorder);
    
}
public String toString(){
    return "[Ball at (" + x + ", " + y + ") with radius " + r + " and velocity (" + stepX + ", " + stepY + ")]";
}

}
