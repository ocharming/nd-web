package Airplane;

public class AirPlane {
  
  private int airnum;
  private String airname;
  private static int airtotalcount;

  //constructor (생성자 함수)
  public AirPlane() {
     this(070, "boing");
  }
  
  public AirPlane(int airnum , String airname){
    this.airnum = airnum;
    this.airname = airname;
    airtotalcount++;
  }
  
  public void airplaneInfo() {
    System.out.printf("번호 : %d, 이름 : %s\n", airnum, airname);
//    System.out.println("번호:" + airnum + " 이름:" + airname);
  }
  
  public void airPlaneTotalCount() {
    System.out.println("총 제작 비행기수 : " + airtotalcount );
  }

}

