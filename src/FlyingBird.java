abstract class FlyingBird extends Bird {

  public void checkWings() {
    System.out.println("Wings have been checked");
  }

  @Override
  public String toString() {
    return "Flying Bird";
  }
}
