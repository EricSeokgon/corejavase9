package ch03.sec06;

import java.awt.*;
import java.awt.image.BufferedImage;

public class PixeTest {

    static BufferedImage createImage(int width, int height, PixelFunction f) {
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = f.apply(x, y);
                image.setRGB(x, y, color.getRGB());
            }
        }
        return image;
    }

    public static void main(String[] args) {
        BufferedImage frenchFlag = createImage(150, 100, (x, y) -> x < 50 ? Color.BLUE : x < 100 ? Color.WHITE : Color.RED);

    }

}
