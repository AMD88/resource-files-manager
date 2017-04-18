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

    /* Would resize the image with given width and height */

    public File resizeImage(File inputImage, int dWidth, int dHeight, String pathname,String formatName) throws IOException {
        Image image = ImageIO.read(inputImage);
        BufferedImage buffered = (BufferedImage) image;
        File outputfile = new File(pathname);
        ImageIO.write(scale(buffered,dWidth,dHeight), formatName, outputfile);
        return outputfile;

    }

    /* This image resize function would get default parameter for pathname and file format name */

    public File resizeImage(File inputImage, int dWidth, int dHeight) throws IOException {
        String fileName = inputImage.getName();
        String filePath = inputImage.getCanonicalPath();
        String extension = getFileExtension(fileName);
        return resizeImage(inputImage,dWidth,dHeight,filePath,extension);
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

    public static String getFileExtension(String fileName){
        String extension = "";

        int i = fileName.lastIndexOf('.');
        if (i > 0) {
            extension = fileName.substring(i+1);

        }
    return extension;
}
}
