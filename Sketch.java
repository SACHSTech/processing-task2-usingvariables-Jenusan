import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here


  int width = 800;
  int height = 800;
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
	  
	// sample code, delete this stuff\

    //sun
    int sunLength = (int)(height/2);
    int sunWidth = (int)(width/2);
    fill(255,255,0);
    ellipse(width,0,sunWidth,sunLength);

    //foreground
    //casting values to ints
    int ground = (int)(height*0.75);
    fill(0,255,0);
    rect(0,ground, width,height);

    //purple flower
    int purpFlowerMidX = (int)(width/2);
    int FlowerStem1y = (int)(height*0.75);
    int FlowerStem2y = (int)(height*0.55);
    line(purpFlowerMidX, FlowerStem1y, purpFlowerMidX, FlowerStem2y);

    int petalLength = (int)(height/7);
    int pistalSize = (int)(width/20);

    fill(102,0,153);
    ellipse(purpFlowerMidX,FlowerStem2y,petalLength,pistalSize);

    fill(102,0,153);
    ellipse(purpFlowerMidX,FlowerStem2y,pistalSize,petalLength);

    fill(255,255,0);
    ellipse(purpFlowerMidX,FlowerStem2y,pistalSize,pistalSize);

    //red flower
    int redFlowerMidX = (int)(width*0.75);
    line(redFlowerMidX, FlowerStem1y, redFlowerMidX, FlowerStem2y);



    fill(255,0,0);
    ellipse(redFlowerMidX,FlowerStem2y,petalLength,pistalSize);

    fill(255,0,0);
    ellipse(redFlowerMidX,FlowerStem2y,pistalSize,petalLength);

    fill(255,255,0);
    ellipse(redFlowerMidX,FlowerStem2y,pistalSize,pistalSize);

    //blue flower
    int blueFlowerStemx = (int)(width/4);
    line(blueFlowerStemx, FlowerStem1y, blueFlowerStemx, FlowerStem2y);

    fill(0,0,255);
    ellipse(blueFlowerStemx,FlowerStem2y,petalLength,pistalSize);

    fill(0,0,255);
    ellipse(blueFlowerStemx,FlowerStem2y,pistalSize,petalLength);

    fill(255,255,0);
    ellipse(blueFlowerStemx,FlowerStem2y,pistalSize,pistalSize);

  }
  
  // define other methods down here.
}