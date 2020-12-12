import java.util.List;

public class Zoo {

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type.
   */
  public static void feed(List<? extends Bird> list) {
    System.out.println("Feeding birds");

    for (Bird value : list) {
      value.eat();
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type.
   * @param bird a new bird.
   */
  public static void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
    bird.checkWings();
    list.add(bird);
    System.out.println("Accepting a bird to a section");
    System.out.println(bird.toString());
  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds.
   * @param newBird bird to add.
   */
  public static void registerBird(List<Bird> list, Bird newBird) {
    System.out.println("Adding a bird to the birds list");
    list.add(newBird);
    for (Object value : list){
      System.out.println(value.toString());
    }
  }
}