package ch03.sec06;

import java.awt.*;

@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
