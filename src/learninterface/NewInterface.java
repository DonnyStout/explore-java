package learninterface;

public interface NewInterface {

  String newString();

  default int newInt() {
    return 0;
  }

  static boolean run() {
    return false;
  }

}
