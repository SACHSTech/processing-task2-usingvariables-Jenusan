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

    float sunLength = (float)(height/2);
    float sunWidth = (float)(width/2);
    float ground = (float)(height*0.75);
    float purpFlowerMidX = (float)(width/2);
    float flowerStem1y = (float)(height*0.75);
    float flowerMid2y = (float)(height*0.55);
    float petalLength = (float)(height/7);
    float pistalSize = (float)(width/20);
    float redFlowerMidX = (float)(width*0.75);
    float blueFlowerMidX = (float)(width/4);

    //sun
    fill(255, 255, 0);
    ellipse(width, 0, sunWidth, sunLength);

    //foreground
    //casting values to int
    fill(0, 255, 0);
    rect(0, ground, width, height);

    //purple flower
    line(purpFlowerMidX, flowerStem1y, purpFlowerMidX, flowerMid2y);

    fill(102,0,153);
    ellipse(purpFlowerMidX, flowerMid2y, petalLength, pistalSize);

    fill(102,0,153);
    ellipse(purpFlowerMidX, flowerMid2y, pistalSize, petalLength);

    fill(255,255,0);
    ellipse(purpFlowerMidX, flowerMid2y, pistalSize, pistalSize);

    //red flower
    line(redFlowerMidX, flowerStem1y, redFlowerMidX, flowerMid2y);

    fill(255,0,0);
    ellipse(redFlowerMidX, flowerMid2y, petalLength, pistalSize);

    fill(255,0,0);
    ellipse(redFlowerMidX, flowerMid2y, pistalSize, petalLength);

    fill(255,255,0);
    ellipse(redFlowerMidX, flowerMid2y, pistalSize, pistalSize);

    //blue flower
    line(blueFlowerMidX, flowerStem1y, blueFlowerMidX, flowerMid2y);

    fill(0,0,255);
    ellipse(blueFlowerMidX, flowerMid2y, petalLength, pistalSize);
 
    fill(0,0,255);
    ellipse(blueFlowerMidX, flowerMid2y, pistalSize, petalLength);

    fill(255,255,0);
    ellipse(blueFlowerMidX, flowerMid2y, pistalSize, pistalSize);

  }
}