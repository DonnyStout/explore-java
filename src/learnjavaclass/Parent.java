package learnjavaclass;

public class Parent {

  public static String field = "Hi from parent";

  static {
    System.out.println("Parent static");
  }

  {
    System.out.println("Parent initializer");
  }


  public Parent() {
    System.out.println("Parent constructor");
  }

  public void parentMethod() {
    System.out.println(field);
  }

}
