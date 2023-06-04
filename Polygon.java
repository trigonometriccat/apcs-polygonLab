
public class Polygon {
    private int numberOfSides = 0;
    private LineSegment[] lineSegments = new LineSegment[0];
    private Point[] vertices = new Point[0];
    private static Polygon[] allPolygons = new Polygon[0];

    public double area() {
        System.out.println("Error: Cannot calculate area for this Polygon");
        return 0;
    }

    public double perimeter() {
        System.out.println("Error: Cannot calculate perimeter for this Polygon");
        return 0;
    }

    public String toString() {
        return "Polygon with " + numberOfSides + " sides, area = " + area() + ", perimeter = " + perimeter();
    }

    public void printReport() {
        System.out.println("There have been " + allPolygons.length + " created.");
        for (int i = 0; i < allPolygons.length; i++) {
            System.out.println(allPolygons[i].toString());
        }
    }

    public void addVertex(Point addThis) {
        int s = vertices.length;
        Point[] dupe = new Point[s + 1];
        for (int i = 0; i < vertices.length; i++) {
            dupe[i] = vertices[i];
        }
        vertices = dupe;
        vertices[s] = addThis;
    }

    public void addSide(LineSegment addThis) {
        int s = lineSegments.length;
        LineSegment[] dupe = new LineSegment[s + 1];
        for (int i = 0; i < lineSegments.length; i++) {
            dupe[i] = lineSegments[i];
        }
        lineSegments = dupe;
        lineSegments[s] = addThis;
    }

    public void addPolygon(Polygon a) {
        int s = allPolygons.length;
        Polygon[] dupe = new Polygon[s + 1];
        for (int i = 0; i < allPolygons.length; i++) {
            dupe[i] = allPolygons[i];
        }
        allPolygons = dupe;
        allPolygons[s] = a;
    }

    public Point[] getVertices() {
        return vertices;
    }

    public LineSegment[] getLineSegments() {
        return lineSegments;
    }

    public void setNumberOfSides(int s) {
        numberOfSides = s;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

}
