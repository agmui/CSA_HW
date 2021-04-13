package other_projects.StudentFolder.pixLab.classes;

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
    Picture beach = new Picture("./src/other_projects/StudentFolder/pixLab/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
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
    Picture swan = new Picture("./src/other_projects/StudentFolder/pixLab/images/swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testMirrorVerticalRightToLeft(Picture img){
    Pixel[][] pixels = img.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (Pixel[] pixel : pixels) {
      for (int col = width; col > width / 2; col--) {
        rightPixel = pixel[col - 1];
        leftPixel = pixel[width - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }
  }
  public static void mirrorHorizontal(Picture img){
    Pixel[][] pixels = img.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < width; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[pixels.length - 1 - row][col];
        botPixel.setColor(topPixel.getColor());
      }
    }
  }
  public static void mirrorHorizontalBotToTop(Picture img){
    Pixel[][] pixels = img.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int width = pixels[0].length;
    for (int row = pixels.length; row > pixels.length/2; row--)
    {
      for (int col = 0; col < width; col++)
      {
        botPixel = pixels[row-1][col];
        topPixel = pixels[pixels.length - row][col];
        topPixel.setColor(botPixel.getColor());
      }
    }
  }

  public static void mirrorDiagonal(Picture img) {
    Pixel[][] pixels = img.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < row; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[col][row];
        botPixel.setColor(topPixel.getColor());
      }
    }
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //Picture beach = new Picture("./src/other_projects/StudentFolder/pixLab/images/beach.jpg");
    //Picture.keepOnlyBlue(beach);
    //Picture.negate(beach);
    //Picture.grayscale(beach);
    //Picture water = new Picture("./src/other_projects/StudentFolder/pixLab/images/water.jpg");
    //Picture.fixUnderwater(water);
    //water.explore();
    //Picture img = new Picture("./src/other_projects/StudentFolder/pixLab/images/122002750_792920851547649_619273314644593133_n (copy).jpg");
    //testMirrorVerticalRightToLeft(img);
    //mirrorHorizontal(img);
    //mirrorHorizontalBotToTop(img);
    //mirrorDiagonal(beach);
    //beach.explore();

    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //Picture.mirrorArms();
    //Picture.mirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //Picture img = new Picture("./src/other_projects/StudentFolder/pixLab/images/flower1.jpg");
    //Picture.copy(img,70,320,0,20, 100, 70);
    //Picture.myCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}