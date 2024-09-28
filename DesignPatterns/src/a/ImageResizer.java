package a;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ImageResizer {
    public static void main(String[] args) {
        String inputImagePath = "/opt/Docker.png";
        String outputImagePath = "/opt/DRA/Docker.jpg";

        try {
            resizeImageTo2MB(inputImagePath, outputImagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void resizeImageTo2MB(String inputPath, String outputPath) throws IOException {
        BufferedImage image = ImageIO.read(new File(inputPath));

        // Ensure the image is in RGB format
        BufferedImage rgbImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
        rgbImage.getGraphics().drawImage(image, 0, 0, null);

        File outputFile = new File(outputPath);
        float quality = 1.0f; // Start with high quality
        long targetSize = 2 * 1024 * 1024; // 2MB
        long fileSize = 0;

        do {
            // Save the image with the current quality setting
            try (ImageOutputStream ios = ImageIO.createImageOutputStream(outputFile)) {
                Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
                if (!writers.hasNext()) throw new IllegalStateException("No writer found");
                
                ImageWriter writer = writers.next();
                ImageWriteParam param = writer.getDefaultWriteParam();

                // Set quality
                if (param.canWriteCompressed()) {
                    param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
                    param.setCompressionQuality(quality);
                }

                writer.setOutput(ios);
                writer.write(null, new javax.imageio.IIOImage(rgbImage, null, null), param);
                writer.dispose();
            }

            // Check the file size
            fileSize = outputFile.length();

            // Adjust quality based on file size
            if (fileSize > targetSize) {
                quality -= 0.05f; // Decrease quality if the file is too large
            } else {
                quality += 0.05f; // Increase quality if the file is too small
            }

            // Ensure quality stays within bounds
            quality = Math.max(0.0f, Math.min(1.0f, quality));
            
        } while (fileSize > targetSize + 1024 || fileSize < targetSize - 1024); // Allow a small margin
    }
}

