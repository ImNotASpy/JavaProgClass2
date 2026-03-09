public class Exercise09_09 {
  public static void main(String[] args) {
    RegularPolygon polygon1 = new RegularPolygon();
    RegularPolygon polygon2 = new RegularPolygon(6, 4);
    RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);
    
    System.out.printf("#1 perimeter: %.2f%n", polygon1.perimeter());
    System.out.printf("#1 area: %.2f%n", polygon1.areaFormula());

    System.out.printf("#2 perimeter: %.2f%n", polygon2.perimeter());
    System.out.printf("#2 area: %.2f%n", polygon2.areaFormula());

    System.out.printf("#3 perimeter: %.2f%n", polygon3.perimeter());
    System.out.printf("#3 area: %.2f%n", polygon3.areaFormula());
  }
}

class RegularPolygon {
  private int n = 3;
  private double side = 1;
  private double x = 0;
  private double y = 0;

  public RegularPolygon() {
  }

  public RegularPolygon(int n, double side) {
    this(n, side, 0, 0);
  }

  public RegularPolygon(int n, double side, double x, double y) {
    this.n = n;
    this.side = side;
    this.x = x;
    this.y = y;
  }

  public int n() {
    return n;
  }

  public void nextN(int n) {
    this.n = n;
  }

  public double side() {
    return side;
  }

  public void nextSide(double side) {
    this.side = side;
  }

  public double x() {
    return x;
  }

  public void nextX(double x) {
    this.x = x;
  }

  public double Y() {
    return y;
  }

  public void nextY(double y) {
    this.y = y;
  }

  public double perimeter() {
    return n *side;
  }

  public double areaFormula() {
    return (n*side*side)/ (4 *Math.tan(Math.PI/n));
  }
}