import java.awt.Color;



/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    //beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testMirrorHorizontal (){
	  
	  Picture caterpillar = new Picture("redMotorcycle.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorHorizontal();
	    caterpillar.explore();
  }
  public static void testChroma(){
	  Picture chroma = new Picture("chroma.jpg");
	  chroma.explore();
	  chroma.chroma(new Picture("sky.jpg"), new Color(96,164,79) , 30);
	  chroma.explore();
  }
  
  public static void testMirrorArms(){
	  Picture caterpillar = new Picture("snowman.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorArms();
	    caterpillar.explore();
  }
  
  public static void testMirrorGull(){
	  Picture gull = new Picture("seagull.jpg");
	    //gull.explore();
	    gull.mirrorGull();
	    gull.explore();
  }
  
  public static void testMirrorBotToTop(){
	
	  	Picture caterpillar = new Picture("redMotorcycle.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorBotToTop();
	    caterpillar.explore();
  }
  
  public static void testKeepOnlyBlue(){
	  Picture beach = new Picture("beach.jpg");  
	  beach.keepOnlyBlue();
	   beach.explore();
  }
  public static void testKeepOnlyRed(){
	  Picture beach = new Picture("beach.jpg");  
	  beach.keepOnlyRed();
	   beach.explore();
  }
  public static void testKeepOnlyGreen(){
	  Picture beach = new Picture("beach.jpg");  
	  beach.keepOnlyGreen();
	   beach.explore();
  }
  
  public static void testNegate(){
	  Picture beach = new Picture("beach.jpg");  
	  beach.Negate();
	   beach.explore();
  }
  public static void testGrayscale(){
	  Picture beach = new Picture ("beach.jpg");
	  beach.grayscale();
	  beach.explore();
  }
  
  
  
  public static void testFixUnderwater(){
	 Picture Water = new Picture ("water.jpg");
	 Water.explore();
	 Water.fixUnderwater();
	 Water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    //caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorDiagonal(){
	  Picture beach = new Picture ("beach.jpg");
	  beach.explore();
	  beach.MirrorDiagonal();
	  beach.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();					//Done
    //testKeepOnlyBlue();				//Done
    //testKeepOnlyRed();				//Done
    //testKeepOnlyGreen();				//Done
    //testNegate();						//Done
    //testGrayscale();					//Done
    //testFixUnderwater();				//Done
    //testMirrorVertical();				//Done
    //testMirrorVerticalRightToLeft();	//Done
    //testMirrorHorizontal();			//done
    //testMirrorBotToTop();				//done
    //testMirrorTemple();				//done
    //testMirrorArms();					//done
    //testMirrorGull();					//done
    //testMirrorDiagonal();					
    //testCollage();
    //testCopy();
    //testEdgeDetection();				//done
    //testEdgeDetection2();				//not done
    //testChroma();						//done
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}