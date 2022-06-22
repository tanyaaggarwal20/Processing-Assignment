import processing.core.PApplet;

public class drawCircles extends PApplet {

    public void drawC(int start, int height, int diameter, int speed){
        ellipse(start, height/2, diameter, diameter);
        start += speed;
    }
}
