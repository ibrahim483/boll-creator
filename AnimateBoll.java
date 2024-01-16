import java.awt.Color;

public class AnimateBoll {
    public static void main(String[] args) {

        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10); // Fix: Use setYscale to set the y-axis scale
        BollBuilder boll_1 = new BollBuilder(0, 0, 4, Color.red, 0.5, 0.5);

        StdDraw.enableDoubleBuffering();

        while (!boll_1.collideX(10)) {
            boll_1.move();
            StdDraw.clear();
            boll_1.draw();
            StdDraw.show();
            StdDraw.pause(200);
            
        //     boll_1.move();
        //     if (boll_1.collideY(10) || boll_1.collideY(-10)) {
        //         boll_1.bounceY(); // Add this line to bounce in the y-direction
        //     }
        //     if (boll_1.collideX(-10) || boll_1.collideX(10)) {
        //         boll_1.bounceX(); // Add this line to bounce in the x-direction
        //     }
        //     StdDraw.clear();
        //     boll_1.draw();
        //     StdDraw.show();
        //     StdDraw.pause(100);
        // }
    }
}
}
