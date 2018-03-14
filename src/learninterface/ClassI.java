package learninterface;

public class ClassI implements NewInterface {

  public static void main(String[] args) {
    ClassI classI = new ClassI();
    classI.newString();
    NewInterface.run();
    classI.newInt();
  }

  public String newString() {
    return null;
  }

}
