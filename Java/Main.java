// Assuming this is the Centered interface

// Main class to demonstrate usage
public class Main {
  public static void main(String[] args) {
    CenteredRectangle rect = new CenteredRectangle(10, 20, 30, 40);
    System.out.println("Initial Center: (" + rect.getCenterX() + ", " + rect.getCenterY() + ")");
    System.out.println("Width: " + rect.getWidth() + ", Height: " + rect.getHeight());
    rect.setCenter(15, 25);
    System.out.println("Updated Center: (" + rect.getCenterX() + ", " + rect.getCenterY() + ")");
  }
}
