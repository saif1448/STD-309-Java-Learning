package TwoDArrayExamples;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePixelView {
    public static void main(String[] args) throws IOException {

        BufferedImage img = ImageIO.read(
                ImagePixelView.class.getResource("bwimage.jpg")
        );

        for(int y = 0; y < img.getHeight(); y++){
            for(int x = 0; x < img.getWidth(); x++){

                int pixel = img.getRGB(x, y);

                int r = (pixel >> 16) & 0xFF;
                int g = (pixel >> 8) & 0xFF;
                int b = pixel & 0xFF;

                System.out.println("(" + x + "," + y + ") -> R:"
                        + r + " G:" + g + " B:" + b);

            }
        }
    }
}
