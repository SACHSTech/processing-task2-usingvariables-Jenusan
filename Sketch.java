import processing.core.PApplet;

/**
 * a program Sketch.java that lets you enter a width and height dimentions of a screen and displays a picture 
 * of flowers with a background.
 */

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here

    size(1000, 1000);
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

    float fltSunLength = (float)(height / 2);
    float fltSunWidth = (float)(width / 2);
    float fltGround = (float)(height * 0.75);
    float fltPurpFlowerMidX = (float)(width / 2);
    float fltFlowerStem1y = (float)(height * 0.75);
    float fltFlowerMid2y = (float)(height * 0.55);
    float fltPetalLength = (float)(height / 7);
    float fltPistalSize = (float)(width / 20);
    float fltRedFlowerMidX = (float)(width * 0.75);
    float fltBlueFlowerMidX = (float)(width / 4);

    //sun
    fill(255, 255, 0);
    ellipse(width, 0, fltSunWidth, fltSunLength);

    //foreground
    //casting values to int
    fill(0, 255, 0);
    rect(0, fltGround, width, height);

    //purple flower
    line(fltPurpFlowerMidX, fltFlowerStem1y, fltPurpFlowerMidX, fltFlowerMid2y);

    fill(102,0,153);
    ellipse(fltPurpFlowerMidX, fltFlowerMid2y, fltPetalLength, fltPistalSize);

    fill(102,0,153);
    ellipse(fltPurpFlowerMidX, fltFlowerMid2y, fltPistalSize, fltPetalLength);

    fill(255,255,0);
    ellipse(fltPurpFlowerMidX, fltFlowerMid2y, fltPistalSize, fltPistalSize);

    //red flower
    line(fltRedFlowerMidX, fltFlowerStem1y, fltRedFlowerMidX, fltFlowerMid2y);

    fill(255,0,0);
    ellipse(fltRedFlowerMidX, fltFlowerMid2y, fltPetalLength, fltPistalSize);

    fill(255,0,0);
    ellipse(fltRedFlowerMidX, fltFlowerMid2y, fltPistalSize, fltPetalLength);

    fill(255,255,0);
    ellipse(fltRedFlowerMidX, fltFlowerMid2y, fltPistalSize, fltPistalSize);

    //blue flower
    line(fltBlueFlowerMidX, fltFlowerStem1y, fltBlueFlowerMidX, fltFlowerMid2y);

    fill(0,0,255);
    ellipse(fltBlueFlowerMidX, fltFlowerMid2y, fltPetalLength, fltPistalSize);
 
    fill(0,0,255);
    ellipse(fltBlueFlowerMidX, fltFlowerMid2y, fltPistalSize, fltPetalLength);

    fill(255,255,0);
    ellipse(fltBlueFlowerMidX, fltFlowerMid2y, fltPistalSize, fltPistalSize);

  }
}