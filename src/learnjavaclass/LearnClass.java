package learnjavaclass;

public class LearnClass extends Parent {

  private static int number;

  static {
    System.out.println("Static initializer");
  }


  {
    number = 5;
    System.out.println("Instance initializer " + number);
  }

  public LearnClass() {
    super();
    System.out.println("Learn class constructor");
  }

  public static void method() {
    System.out.println("Static method of parent.");
  }

  public void nonStatic() {
    super.parentMethod();
    System.out.println("Non static method of parent.");
  }

}
