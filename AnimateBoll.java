import java.awt.Color;

public class AnimateBoll {
    public static void main(String[] args) {

        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10); // Fix: Use setYscale to set the y-axis scale
        BollBuilder boll_1 = new BollBuilder(0, 0, 1, Color.red, 0.5, 0.5);
        BollBuilder boll_2 = new BollBuilder(0, 0.5, 1,0.5,0.5);

        StdDraw.enableDoubleBuffering();

        while (true) {

            if(boll_1.collideX(10) || boll_1.collideX(-10)){boll_1.bounceX();}
            if(boll_1.collideY(10) || boll_1.collideY(-10)){boll_1.bounceY();}

            if(boll_2.collideX(10) || boll_2.collideX(-10)){boll_2.bounceX();}
            if(boll_2.collideY(10) || boll_2.collideY(-10)){boll_2.bounceY();}

            boll_1.move();
            boll_2.move();

            StdDraw.clear();
            boll_1.draw();
            boll_2.draw();

            StdDraw.show();
            System.out.println(boll_1.toString());
            System.out.println(boll_2.toString());
            
            StdDraw.pause(20);
            
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
