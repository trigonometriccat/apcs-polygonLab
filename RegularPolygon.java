import org.w3c.dom.views.DocumentView;

public class RegularPolygon extends Polygon {
    // reg poly area: 0.5ap, a is apothem, p is perim.
    // reg poly: all sides same len
    // apothem: (side)/(2(tan(180/(n of sides))))
    // suppose that a circle cirumscribes this shape. lets have the cen of cir @
    // origin.
    private double sideLength;
    private double apothem;

    public RegularPolygon(int nofsides, double sideLength) {
        setNumberOfSides(nofsides);
        this.sideLength = sideLength;
        apothem = sideLength / (2 * Math.tan(2 * Math.PI / nofsides));
        Point initial = new Point(-apothem, sideLength / 2);
        double x0 = -apothem;
        double y0 = sideLength / 2;
        addVertex(initial);
        double radius = Math.sqrt((Math.pow(x0, 2)) + (Math.pow(y0, 2)));
        for (int i = 1; i < nofsides; i++) {
            addVertex(new Point(x0 + radius * Math.cos((2 * i * Math.PI) / nofsides),
                    y0 + radius * Math.sin((2 * i * Math.PI) / nofsides)));
        }
        // that was not fun!
        // time for sides!
        Point[] vertices = getVertices();
        for (int i = 0; i < nofsides - 1; i++) {
            addSide(new LineSegment(vertices[i], vertices[i + 1]));
        }
        addSide(new LineSegment(vertices[nofsides - 1], vertices[0]));
    }

    public double area() {
        if (getNumberOfSides() < 3) {
            return 0;
        }
        return 0.5 * perimeter() * apothem;
    }

    public double perimeter() {
        return getNumberOfSides() * sideLength;
    }

}
