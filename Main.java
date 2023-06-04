public class Main {
    public static void main(String[] args) {
        awesomePolygonAreas();
    }

    public static void awesomeRectangleMaker() {
        Rectangle[] rec = new Rectangle[10];
        for (int i = 0; i < 10; i++) {
            rec[i] = new Rectangle(i + 1, i + 2);
        }
        rec[9].printReport();
    }

    public static void awesomePolygonAreas() {
        // assume side length is 1?
        double sum = 0;
        RegularPolygon[] rpoly = new RegularPolygon[25];
        for (int i = 2; i < 25; i++) {
            rpoly[i] = new RegularPolygon(i + 1, 1);
            sum += rpoly[i].area();
        }
        System.out.println(sum); // 206.9387379971993

    }
}
