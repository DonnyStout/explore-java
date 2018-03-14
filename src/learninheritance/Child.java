package learninheritance;

public class Child extends Parent {

  public static String instanceField = "Child instance field";


  public void staticMethod() {
    System.out.println(instanceField);
  }

}
