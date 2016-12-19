package com.github.amd88;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


/**
 * Created by amoda on 12/13/16.
 */
public class FileProcessor {

    public BufferedImage resizeImage(File imageName, int size) throws IOException {
       // return imageName.length();
        Image image = ImageIO.read(imageName);
        BufferedImage buffered = (BufferedImage) image;
        return scale(buffered,200,200);

    }

    public static BufferedImage scale(BufferedImage imageToScale, int dWidth, int dHeight) {
        BufferedImage scaledImage = null;
        if (imageToScale != null) {
            scaledImage = new BufferedImage(dWidth, dHeight, imageToScale.getType());
            Graphics2D graphics2D = scaledImage.createGraphics();
            graphics2D.drawImage(imageToScale, 0, 0, dWidth, dHeight, null);
            graphics2D.dispose();
        }

       // Arrays.stream(new int[]{1,0,0});
        return scaledImage;
    }

}
