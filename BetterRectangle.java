import java.awt.*;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }
    public int getArea()
    {
        return height*width;
    }
    public int getPerimeter()
    {
        return 2*(height+width);
    }
}
