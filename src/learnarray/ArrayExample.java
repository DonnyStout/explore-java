package learnarray;

import java.util.ArrayList;

public class ArrayExample {

  public static ArrayList<Integer> intList = new ArrayList<>();
  public static int[] intString = {3, 4, 5, 6, 7};
  public String[][] stringArray = new String[][]{{"String", "Why", "Red", "Go", "Away"}, {"Still", "lots", "of", "red"}};

  public static void getList() {
    int saveInstance = intString[1];
    intList.add(0);
    System.out.println(intList.get(0));
  }



}
