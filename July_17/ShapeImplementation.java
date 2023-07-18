import java.util.*;

class InvalidDimensionsException extends Exception {
  public InvalidDimensionsException(String e) {
    super(e);
  }
}

abstract class ShapeAb {
  public abstract void calculateArea();

  public abstract void calculatePerimeter();
}

class Circle2 extends ShapeAb {
  double radius;

  public Circle2(double radius) {
    this.radius = radius;
  }

  @Override
  public void calculateArea() {
    System.out.println("The area of circle is " + (Math.PI * radius * radius));

  }

  @Override
  public void calculatePerimeter() {
    System.out.println("The area of circle is " + (2 * Math.PI * radius));

  }

}

class Triangle1 extends ShapeAb {
  double side1, side2, side3;

  public Triangle1(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  @Override
  public void calculateArea() {
    double s = (side1 + side2 + side3) / 2;
    System.out.println("The Area of Triangle is : " + Math.sqrt((s * (s - side1) * (s - side2) * (s - side3))));

  }

  @Override
  public void calculatePerimeter() {
    System.out.println("The Perimeter of Triangle is " + (side1 + side2 + side3));

  }

}

class Rectangle1 extends ShapeAb {
  double length, width;

  public Rectangle1(double length, double width) {
    super();
    this.length = length;
    this.width = width;
  }

  @Override
  public void calculateArea() {
    System.out.println("The area of Rectangle is : " + (length * width));

  }

  @Override
  public void calculatePerimeter() {
    System.out.println("The Perimeter of Rectangle is : " + (2 * (length + width)));

  }

}

class ShapeImplementation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int option = 0;
    do {
      System.out.println("1. Circle");
      System.out.println("2. Rectangle");
      System.out.println("3. Triangle");
      System.out.println("4. Exit");
      option = sc.nextInt();
      if (option == 1) {
        System.out.println("Enter the radius of circle");
        double radius = 0;
        try {
          radius = sc.nextDouble();
          if (radius <= 0)
            throw new InvalidDimensionsException("Enter positive values");
          else {
            ShapeAb c = new Circle2(radius);
            c.calculateArea();
            c.calculatePerimeter();
          }
        } catch (InvalidDimensionsException e) {
          System.out.println(e);
        }
      } else if (option == 2) {
        System.out.println("Enter the length of rectangle");
        double l = sc.nextDouble();
        System.out.println("Enter the width of rectangle");
        double w = sc.nextDouble();
        try {
          if (l <= 0 || w <= 0) {
            throw new InvalidDimensionsException("Enter the positive values");
          } else {
            ShapeAb r = new Rectangle1(l, w);
            r.calculateArea();
            r.calculatePerimeter();
          }
        } catch (InvalidDimensionsException e) {
          System.out.println(e);
        }
      } else if (option == 3) {
        System.out.println("Enter the side one value");
        double side1 = sc.nextDouble();
        System.out.println("Enter the side two value");
        double side2 = sc.nextDouble();
        System.out.println("Enter the side three value");
        double side3 = sc.nextDouble();
        try {
          if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new InvalidDimensionsException("Enter the positive values");
          } else {
            ShapeAb t = new Triangle1(side1, side2, side3);
            t.calculateArea();
            t.calculatePerimeter();
          }
        } catch (InvalidDimensionsException e) {
          System.out.println(e);
        }
      } else if (option == 4) {
        System.out.println("***** THANKYOU ********");
      } else {
        System.out.println("Enter the correct option");
      }

    } while (option != 4);

  }
}
