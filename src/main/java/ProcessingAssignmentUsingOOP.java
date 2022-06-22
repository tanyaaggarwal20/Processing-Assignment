import processing.core.PApplet;

public class ProcessingAssignmentUsingOOP extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static int x = 0;

    public static void main(String[] args) { PApplet.main ("ProcessingAssignmentUsingOOP", args); }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawCircles b1 = new drawCircles();
        b1.drawC(0, HEIGHT, DIAMETER, 1);

        drawCircles b2 = new drawCircles();
        b2.drawC(0, HEIGHT, DIAMETER, 2);

        drawCircles b3 = new drawCircles();
        b3.drawC(0, HEIGHT, DIAMETER, 3);

        drawCircles b4 = new drawCircles();
        b4.drawC(0, HEIGHT, DIAMETER, 4);
    }
}


