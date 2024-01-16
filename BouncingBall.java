import java.awt.Color;

public class BouncingBall {

    public static void main(String[] args) {

        // Constants for the ball's color, speed, and size
        Color color = Color.RED;
        double speed = 1.0;
        double radius = 0.05;

        // Constants for the width and height of the canvas
        double width = 1.0;
        double height = 1.0;

        // Variables to track the ball's position and velocity
        double x = width / 2;
        double y = height / 2;
        double dx = speed;
        double dy = speed;

        // Main simulation loop
        while (true) {

            // Move the ball
            x += dx;
            y += dy;

            // Bounce the ball off the top and bottom edges
            if (y - radius < 0 || y + radius > height) {
                dy = -dy;
            }

            // Bounce the ball off the left and right edges
            if (x - radius < 0 || x + radius > width) {
                dx = -dx;
            }

            // Clear the canvas
            StdDraw.clear();

            // Draw the ball
            StdDraw.setPenColor(color);
            StdDraw.filledCircle(x, y, radius);

            // Update the display
            StdDraw.show();

            // Sleep for a short time to control the frame rate
            StdDraw.pause(50);
        }
    }
}