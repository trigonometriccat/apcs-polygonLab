public class Rectangle extends Polygon {
    // the lab requires us to utilize length and width, lets do that:
    private double length, width;

    public Rectangle(int length, int width) {
        // assume corner @ 0,0
        setNumberOfSides(4);
        addPolygon(this);
        this.length = length;
        this.width = width;
        // B ----LEN------ C
        // | <---WIDTH---> |
        // A -----LEN----- D
        Point ptA = new Point(0, 0);
        Point ptB = new Point(0, width);
        Point ptC = new Point(width, length);
        Point ptD = new Point(length, 0);
        LineSegment lsAB = new LineSegment(ptA, ptB);
        LineSegment lsBC = new LineSegment(ptB, ptC);
        LineSegment lsCD = new LineSegment(ptC, ptD);
        LineSegment lsDA = new LineSegment(ptD, ptA);
        addVertex(ptA);
        addVertex(ptB);
        addVertex(ptC);
        addVertex(ptD);
        addSide(lsAB);
        addSide(lsBC);
        addSide(lsCD);
        addSide(lsDA);
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return 2 * length + 2 * width;
    }
}
