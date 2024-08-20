package Chapter9ObjectsAndClasses;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(4,40);
        Rectangle rectangle1=new Rectangle(3.5,35.9);
        System.out.println("rectangle "+rectangle.getArea());
        System.out.println("rectangle "+rectangle.getPerimeter());
        System.out.println("rectangle " +rectangle.getHeight());
        System.out.println("rectangle "+rectangle.getWidth());
        System.out.println("rectangle "+rectangle1.getArea());
        System.out.println("rectangle "+rectangle1.getPerimeter());
        System.out.println("rectangle " +rectangle1.getHeight());
        System.out.println("rectangle "+rectangle1.getWidth());

    }
}
