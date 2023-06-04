public class LineSegment {
    public LineSegment(Point a, Point b) {
        ptA = a;
        ptB = b;
    }

    public LineSegment() {
        ptA = new Point();
        ptB = new Point();
    }

    public Point ptA = new Point();
    public Point ptB = new Point();
}