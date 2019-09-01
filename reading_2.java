public class ReadingTwo {
  public static void main(String[] args) {
    exerciseOne();
    exerciseTwo();
    exerciseThree();
  }

  private static void exerciseOne() {
    int number = 4;
    System.out.println("EXERCISE #1");
    System.out.println(number);
  }

  private static void exerciseTwo() {
    int result = ((((1 + 2 - 1) * 2) / 2) + 8) % 7;
    System.out.println("EXERCISE #2");
    System.out.println(result);
  }

  private static void exerciseThree() {
    System.out.println("EXERCISE #3");
    int aNumber = 3;
    if (aNumber >= 0) {
      if (aNumber == 0) {
        System.out.println("first string");
      } else {
        System.out.println("second string");
      }

    System.out.println("third string");
  }
}
