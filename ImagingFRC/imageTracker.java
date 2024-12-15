import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

import javax.imageio.ImageIO; 

class getPixels {
    private static int low_red = 140; 
    private static int high_red = 250;
    private static int low_blu = 80;
    private static int high_blu = 230;
    private static int low_green = 50; 
    private static int high_green = 180; 
    private static Color minRange = new Color(low_red, low_blu, low_green); 
    private static Color maxRange = new Color(high_red, high_blu, high_green); 

    public static void takeImage() {
        try {
            BufferedImage img = ImageIO.read (new File("note.jpg"));  
            Raster tiledImg = img.getData(); 
            long imgHt = tiledImg.getHeight(); 
            long imgWt = tiledImg.getWidth(); 
            for (int i = 0; i < imgWt; i += 1) {
                for (int r = 0; r < imgHt; r += 1) {
                    Color pixel = new Color(img.getRGB(i, r));
                    if (pixel.getRGB() < minRange.getRGB() || pixel.getRGB() > maxRange.getRGB()) {
                        img.setRGB(i, r, 000000); 
                    }
                }
            }   
                BufferedImage img2 = img; 
                File f = new File("newnote.jpg");
                ImageIO.write(img, "jpg", f);

        }  catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); 
        }

    }

    public static void main(String[] args) {
        getPixels.calculateMean(); 
        getPixels.findAngleError(calculateMean());
    }

    public static int[] calculateMean() {
        /*Modify your program from Step 1 to calculate the mean position of the pixels that were within the specified range of RGB values.
The output image should contain something marking where this mean position is.  i.e: a crosshair or dot, etc
You may create a new program for this, or you may add an option to your program from Step 1.
 */
        try {
            BufferedImage img = ImageIO.read(new File("newnote.jpg")); 
            Raster tiledImg = img.getData(); 
            long imgHt = tiledImg.getHeight(); 
            long imgWt = tiledImg.getWidth(); 
            long imgposX = 0; 
            long imgposY = 0;
            long count = 0; 
            for (int i = 0; i < imgWt; i += 1) {
                for (int r = 0; r < imgHt; r += 1) {
                    Color black = new Color(0, 0, 0);
                    Color pixel = new Color(img.getRGB(i, r));
                    if (pixel.getRGB() > minRange.getRGB() && pixel.getRGB() < maxRange.getRGB()) {
                        imgposX += i; 
                        imgposY += r; 
                        count += 1;
                    }
                }
            } 
            long newPosX = imgposX / count; 
            long newPosY = imgposY / count; 
            int posX = (int) newPosX; 
            int posY = (int) newPosY; 
            //img.setRGB(posX, posY, 064265237); 
            for (int i = -500; i <= 500; i += 1) {
                img.setRGB(posX + i, posY, 255000000); 
                img.setRGB(posX, posY + i, 255000000); 
            }
            BufferedImage img3 = img; 
                File f = new File("newnotewithline.jpg");
                ImageIO.write(img3, "jpg", f);
            
            int [] mean = {posX, posY}; 
            return mean; 
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null; 
        }
    }  
/*Step 4 -------------------------------------------------------------------------------------------
==================================================================================================
Modify your program from after Steps 2 and 3 to also take in as input into your program the FOV dimensions of the camera used to take a picture.
Use this information to calculate the angle at which the "mean position" from Step 2 is away from the camera.
    */
// We know our FOV for the two dimensions, X and Y 
// 

 /*    public static double finderrorX(int[] mean) {
        double halffocalX = 16.5; //inches
        double halffocalY = 21.5; //inches
        int distCam = 17; // inches
        int meanX = mean[0]; // pixels
        int meanY = mean[1]; // pixels
        double inX = meanX * 0.002174; 
        double inY = meanY * 0.002174; 
        double totalX = 3024; 
        double totalY = 4032; 
        double Xerror; 


        for (int i = 0; i <= 0; i += 1) {
            double remainX = totalX - meanX; 
            double inremainX = remainX * 0.002174; 
            if (inremainX > halffocalX) {
                Xerror = inremainX - halffocalX; 
                return Xerror; // you would have to subtract the 
                // amount of pixels from the total to get the position, and then subtract the remaining half 
                // from the position to get the triangle that you need to find the distance. 
            }
            else if (inremainX < halffocalX) {
                Xerror = halffocalX - inremainX; 
                return Xerror; 
                // Here, we do the opposite, as instead we need to subtract the position from the half to get the triangle. 
            }

            else {
                return 0.0; 
            }
        } return 0.0; 

    }


    public static double findErrorY (int[]mean) {
        double halffocalX = 16.5; //inches
        double halffocalY = 21.5; //inches
        int distCam = 17; // inches
        int meanX = mean[0]; // pixels
        int meanY = mean[1]; // pixels
        double inX = meanX * 0.002174; 
        double inY = meanY * 0.002174; 
        double totalX = 3024; 
        double totalY = 4032; 
        double Yerror; 
        for (int i = 0; i <= 0; i += 1) {
            double remainY = totalY - meanY; 
            double inremainY = remainY * 0.002174; 
            if (inremainY > halffocalY) {
                Yerror = inremainY - halffocalY; 
                return Yerror; // you would have to subtract the 
                // amount of pixels from the total to get the position, and then subtract the remaining half 
                // from the position to get the triangle that you need to find the distance. 
            }
            else if (inremainY < halffocalY) {
                Yerror = halffocalX - inremainY; 
                return Yerror; 
                // Here, we do the opposite, as instead we need to subtract the position from the half to get the triangle. 
            }

            else {
                return 0.0; 
            }
        } return 0.0; 

    } */

 /*  public static double findHypotenuse (long posX, long posY) {
        long xPixels = posX / 2; 
        long yPixels = posY / 2; 

        long toAddY = (yPixels - posY) * (yPixels - posY); 
        long toAddX = (xPixels - posX) * (xPixels - posX); 

        long sum = toAddY + toAddX; 
        double opposite = Math.sqrt(sum); 
        double inchopposite = opposite * 0.002174; 

        double hypotenuse = inchopposite * inchopposite + 17*17; 
        double finalDist = Math.sqrt(hypotenuse); 
        System.out.println(finalDist);

        double angle = Math.atan(inchopposite / 17); 
        System.out.println(angle); 
        return angle; 
    }
*/

    public static void findAngleError (int[] mean) {
        long posX = mean[0]; 
        long posY = mean[1]; 
        double verPxDeg = 4032.0 / 43.0; 
        double horPxDeg = 3024.0 / 33.0; 

        System.out.println(verPxDeg); 
        System.out.println(horPxDeg);
        
        long distFromOriginX = 1512 - posX; 
        long distFromOriginY = 2016 - posY; 

        double angleX = distFromOriginX / horPxDeg; 
        double angleY = distFromOriginY / verPxDeg; 

        System.out.println("The camera must rotate " + angleX + " degrees right, and " + angleY + " degrees down"); 
    }
    
}

/*Step 5 -------------------------------------------------------------------------------------------
==================================================================================================
How could the information your program provides after Step 4 be used by an FRC robot?
Instead of filtering pixels by RGB values, are there better ways to track objects?*/


