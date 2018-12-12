package star;

public class StarCreate {

  public void getStar(int num) {

    for(int i = 2; i < num; i++) {
      for(int j = 0; j < i; j++) {
        System.out.printf("*");
      }
      System.out.println("");
    }
  }

}
