package Rectangle;

public class Rectangle {

    private final Point A;
    private final Point B;

    public final double leftUP;
    public final double rightUP;
    public final double leftDown;
    public final double RightDown;


    public Rectangle(double x1, double y1, double x2, double y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public Rectangle(Point a, Point b) {
        if (a == null && b == null) {
            leftUP = rightUP = leftDown = RightDown = 0;
            A = new Point();
            B = new Point();
        } else if (a != null && b != null) {

            leftUP = a.x < b.x ? a.x : b.x;
            rightUP = a.x > b.x ? a.x : b.x;
            leftDown = a.y < b.y ? a.y : b.y;
            RightDown = a.y > b.y ? a.y : b.y;
            this.A = new Point(leftUP, leftDown);
            this.B = new Point(rightUP, RightDown);
        } else {
            Point p = b == null ? a : b;

            leftUP = p.x < 0 ? p.x : 0;
            rightUP = p.x > 0 ? p.x : 0;
            leftDown = p.y < 0 ? p.y : 0;
            RightDown = p.y > 0 ? p.y : 0;
            this.A = new Point(leftUP, leftDown);
            this.B = new Point(rightUP, RightDown);
        }
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (getA() != null ? !getA().equals(rectangle.getA()) : rectangle.getA() != null) return false;
        return getB() != null ? getB().equals(rectangle.getB()) : rectangle.getB() == null;
    }

    @Override
    public int hashCode() {
        int result = getA() != null ? getA().hashCode() : 0;
        result = 31 * result + (getB() != null ? getB().hashCode() : 0);
        return result;
    }
}
