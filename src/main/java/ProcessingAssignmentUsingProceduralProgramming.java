import processing.core.PApplet;

public class ProcessingAssignmentUsingProceduralProgramming extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static int m = 0;
    public static int n = 0;
    public static int o = 0;
    public static int p = 0;

    public static void main(String[] args) { PApplet.main("ProcessingAssignmentUsingProceduralProgramming", args); }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

//    @Override
//    public void setup() {
//    }

    @Override
    public void draw() {
        ellipse(m, HEIGHT/5, DIAMETER, DIAMETER);  //for ball 1
        m++;
        ellipse(n, (HEIGHT * 2)/5, DIAMETER, DIAMETER);  //for ball 2
        n += 2;
        ellipse(o, (HEIGHT * 3)/5, DIAMETER, DIAMETER);  //for ball 3
        o += 3;
        ellipse(p, (HEIGHT * 4)/5, DIAMETER, DIAMETER);  //for ball 4
        p += 4;

    }
}
