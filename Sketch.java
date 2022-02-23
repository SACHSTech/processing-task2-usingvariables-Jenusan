import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here


   int width = 1000;
  int height = 1000;
    size(width, height);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51, 204, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    int sunLength = (int)(height/2);
    int sunWidth = (int)(width/2);
    int ground = (int)(height*0.75);
    int purpFlowerMidX = (int)(width/2);
    int FlowerStem1y = (int)(height*0.75);
    int FlowerMid2y = (int)(height*0.55);
    int petalLength = (int)(height/7);
    int pistalSize = (int)(width/20);
    int redFlowerMidX = (int)(width*0.75);
    int blueFlowerMidX = (int)(width/4);

    //sun
    fill(255, 255, 0);
    ellipse(width, 0, sunWidth, sunLength);

    //foreground
    //casting values to int
    fill(0, 255, 0);
    rect(0,ground, width, height);

    //purple flower
    line(purpFlowerMidX, FlowerStem1y, purpFlowerMidX, FlowerMid2y);

    fill(102,0,153);
    ellipse(purpFlowerMidX,FlowerMid2y,petalLength,pistalSize);

    fill(102,0,153);
    ellipse(purpFlowerMidX,FlowerMid2y,pistalSize,petalLength);

    fill(255,255,0);
    ellipse(purpFlowerMidX,FlowerMid2y,pistalSize,pistalSize);

    //red flower
    line(redFlowerMidX, FlowerStem1y, redFlowerMidX, FlowerMid2y);

    fill(255,0,0);
    ellipse(redFlowerMidX,FlowerMid2y,petalLength,pistalSize);

    fill(255,0,0);
    ellipse(redFlowerMidX,FlowerMid2y,pistalSize,petalLength);

    fill(255,255,0);
    ellipse(redFlowerMidX,FlowerMid2y,pistalSize,pistalSize);

    //blue flower
    line(blueFlowerMidX, FlowerStem1y, blueFlowerMidX, FlowerMid2y);

    fill(0,0,255);
    ellipse(blueFlowerMidX,FlowerMid2y,petalLength,pistalSize);

    fill(0,0,255);
    ellipse(blueFlowerMidX,FlowerMid2y,pistalSize,petalLength);

    fill(255,255,0);
    ellipse(blueFlowerMidX,FlowerMid2y,pistalSize,pistalSize);

  }
  
  // define other methods down here.
}