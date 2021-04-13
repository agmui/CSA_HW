package other_projects.StudentFolder.pixLab.classes;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }

  public static void keepOnlyBlue(Picture img){
    Pixel[][] pixels = img.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
        pixelObj.setRed(0);
      }
    }
  }

  public static void negate(Picture img){
    Pixel[][] pixels = img.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255-pixelObj.getRed());
        pixelObj.setGreen(255-pixelObj.getGreen());
        pixelObj.setBlue(255-pixelObj.getBlue());
      }
    }
  }

  public static void grayscale(Picture img){
    Pixel[][] pixels = img.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setColor(new Color((int)pixelObj.getAverage(),(int)pixelObj.getAverage(),(int)pixelObj.getAverage()));
      }
    }
  }

  public static void fixUnderwater(Picture img){
    Pixel[][] pixels = img.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        int r = pixelObj.getRed();
        int g = pixelObj.getGreen();
        int b = pixelObj.getBlue();
        if(b<=112){
            r=0;
            g=0;
            b=0;
        }
        float[] hsv = new float[3];
        Color.RGBtoHSB(r,g,b,hsv);
        hsv[2]=1;
        int rgb = Color.HSBtoRGB(hsv[0], hsv[1], hsv[2]);
        pixelObj.setColor(Color.getColor("rgb", rgb).darker().darker());
        g = pixelObj.getGreen();
        b = pixelObj.getBlue();
        if(b<=121 || g <= 110){
          pixelObj.setRed(0);
          pixelObj.setGreen(0);
          pixelObj.setBlue(0);
        }
      }
    }
    grayscale(img);
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        if(pixelObj.getBlue()!=0) pixelObj.setColor(Color.WHITE);
      }}
  }

  /** Method that mirrors the picture around a
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }

  public static void mirrorArms()
  {
    Picture img = new Picture("./src/other_projects/StudentFolder/pixLab/images/snowman.jpg");
    int mirrorPoint = 205;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = img.getPixels2D();

    // loop through the rows
    for (int row = 157; row < 200; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 108; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row]
                [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    img.explore();
  }

  public static void mirrorGull()
  {
    Picture img = new Picture("./src/other_projects/StudentFolder/pixLab/images/seagull.jpg");
    int mirrorPoint = 335;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = img.getPixels2D();

    // loop through the rows
    for (int row = 228; row < 326; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 230; col < mirrorPoint; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row]
                [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    img.explore();
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  public static void copy(Picture fromPic, int startRow, int startCol, int fromStartR, int fromStartC, int fromEndR, int fromEndC)
  {
    Picture img = new Picture("./src/other_projects/StudentFolder/pixLab/images/122002750_792920851547649_619273314644593133_n (copy).jpg");
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = img.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = fromStartR, toRow = startRow; fromRow < fromEndR && toRow < toPixels.length; fromRow++, toRow++)
    {
      for (int fromCol = fromStartC, toCol = startCol; fromCol <fromEndC && toCol < toPixels[0].length; fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }
    img.explore();
  }
  public static void myCollage(){
    Picture flower1 = new Picture("./src/other_projects/StudentFolder/pixLab/images/flower1.jpg");
    Picture flower2 = new Picture("./src/other_projects/StudentFolder/pixLab/images/flower2.jpg");
    Picture swan = new Picture("./src/other_projects/StudentFolder/pixLab/images/swan.jpg");
    Picture img = new Picture("./src/other_projects/StudentFolder/pixLab/images/122002750_792920851547649_619273314644593133_n (copy).jpg");
    flower1.zeroBlue();
    flower2.mirrorVertical();
    fixUnderwater(swan);
    img.copy(flower1,0,0);
    img.copy(flower2,170,0);
    img.copy(swan,0,200);
    img.explore();
    //img.write("./src/other_projects/StudentFolder/pixLab/images/122002750_792920851547649_619273314644593133_n (copy).jpg");
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color botColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        /*leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);*/
        topPixel = pixels[row][col];
        botPixel  = pixels[row+1][col];
        //botPixel  = pixels[row+1][col+1];
        botColor = botPixel.getColor();
        if (topPixel.colorDistance(botColor) >
                edgeDist)
          topPixel.setColor(Color.BLACK);
        else
          topPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    //DigitalPicture p = new DigitalPicture();
    //DigitalPicture p = new SimplePicture();
    //DigitalPicture p = new Picture();
    //Picture p = new SimplePicture();
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
