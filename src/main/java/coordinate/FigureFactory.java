package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FigureFactory {
    private static final HashMap<Integer, Function<List<Point>, Figure>> hashMap = new HashMap<>();
    
    static {
        hashMap.put(Line.LINE_POINT_SIZE, Line::new);
        hashMap.put(Triangle.TRIANGLE_POINT_SIZE, Triangle::new);
        hashMap.put(Rectangle.RECTANGLE_POINT_SIZE, Rectangle::new);
    }
    
    static Figure getInstance(List<Point> points) throws IllegalArgumentException {
        if (points == null) {
            throw new IllegalArgumentException("유효하지 않은 도형입니다.");
        }
        
        return hashMap.get(points.size()).apply(points);
    }
}
