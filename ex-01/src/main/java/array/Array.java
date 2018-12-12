package array;

public class Array {

  public static void main(String[] args) {
  
    //1. 수학과 학생들의 기말고사 시험 점수
    int[] score = new int[] {79,88,97,54,56,95};
    int max = score[2]; //79
    int min = score[3]; //79
    //1.제어문을 사용해서 
    //max 변수에 최대값 : 97
    //min 변수에 최소값 : 54 들어가게 해서 max , min 값을 출력
    
    System.out.println("Max = " + score[2]);
    System.out.println("Min = " + score[3]);
    System.out.println();
    
    //2. 어느 학생의 기말 성적
    int sum = 0;
    float avg = 0f;
    int[] jumsu = {100,55,90,60,78};
    //1. 총 과목수
    //2. 점수의 합
    //3. 점수의 평균을 구하세요  (2,3 번은 하나의 for문에서)
    
    System.out.println("총 과목수 = " + jumsu.length);
    for (int i = 0; i < jumsu.length; i++) {
      sum += jumsu[i];
      avg = sum / (float) jumsu.length;
    }
    System.out.println("총점수 = " + sum);
    System.out.println("평균 = " + avg);
    
  }
}
